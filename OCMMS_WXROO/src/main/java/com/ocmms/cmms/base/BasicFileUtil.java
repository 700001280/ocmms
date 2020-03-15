package com.ocmms.cmms.base;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.io.Files;

/**
 * 
 * @author qinzeyong
 *
 */
public class BasicFileUtil {

	public static boolean isAbsFile(String fileName) {
		if (OSUtil.isWinOS()) {
			return fileName.contains(":") || fileName.startsWith("\\");
		} else {
			return fileName.startsWith("/");
		}
	}

	/**
	 * 将用户目录下地址~/xxx 转换为绝对地址
	 *
	 * @param path
	 * @return String
	 */
	public static String parseHomeDir2AbsDir(String path) {
		String homeDir = System.getProperties().getProperty("user.home");
		return StringUtils.replace(path, "~", homeDir);
	}

	public static String getFileExtension(String filename) {
		return FilenameUtils.getExtension(filename);
	}

	public static String getExtensionByGuava(String filename) {
		return Files.getFileExtension(filename);
	}

	public static String getSystemDefineFileName() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return String.valueOf(calendar.getTimeInMillis());
	}
}
