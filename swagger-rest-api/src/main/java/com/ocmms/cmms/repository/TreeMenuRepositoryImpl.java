package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.TreeMenu;
import com.ocmms.cmms.model.system.QTreeMenu;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TreeMenuRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TreeMenuRepositoryImpl extends QueryDslRepositorySupportExt<TreeMenu> implements TreeMenuRepositoryCustom {

	/**
	 * Default constructor
	 */
	TreeMenuRepositoryImpl() {
		super(TreeMenu.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PARENT_MENU = "parentMenu";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String URL_LINK = "urlLink";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOGIN_ROLES = "loginRoles";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String VISIBLE = "visible";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TreeMenu> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTreeMenu treeMenu = QTreeMenu.treeMenu;
		JPQLQuery<TreeMenu> query = from(treeMenu);
		Path<?>[] paths = new Path<?>[] { treeMenu.description, treeMenu.urlLink, treeMenu.visible, treeMenu.parentMenu,
				treeMenu.loginRoles, treeMenu.recordStatus, treeMenu.createdDate, treeMenu.createdBy,
				treeMenu.lastModifiedDate, treeMenu.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, treeMenu.description)
				.map(URL_LINK, treeMenu.urlLink).map(VISIBLE, treeMenu.visible).map(PARENT_MENU, treeMenu.parentMenu)
				.map(LOGIN_ROLES, treeMenu.loginRoles).map(RECORD_STATUS, treeMenu.recordStatus)
				.map(CREATED_DATE, treeMenu.createdDate).map(CREATED_BY, treeMenu.createdBy)
				.map(LAST_MODIFIED_DATE, treeMenu.lastModifiedDate).map(LAST_MODIFIED_BY, treeMenu.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, treeMenu);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TreeMenu> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTreeMenu treeMenu = QTreeMenu.treeMenu;
		JPQLQuery<TreeMenu> query = from(treeMenu);
		Path<?>[] paths = new Path<?>[] { treeMenu.description, treeMenu.urlLink, treeMenu.visible, treeMenu.parentMenu,
				treeMenu.loginRoles, treeMenu.recordStatus, treeMenu.createdDate, treeMenu.createdBy,
				treeMenu.lastModifiedDate, treeMenu.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(treeMenu.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, treeMenu.description)
				.map(URL_LINK, treeMenu.urlLink).map(VISIBLE, treeMenu.visible).map(PARENT_MENU, treeMenu.parentMenu)
				.map(LOGIN_ROLES, treeMenu.loginRoles).map(RECORD_STATUS, treeMenu.recordStatus)
				.map(CREATED_DATE, treeMenu.createdDate).map(CREATED_BY, treeMenu.createdBy)
				.map(LAST_MODIFIED_DATE, treeMenu.lastModifiedDate).map(LAST_MODIFIED_BY, treeMenu.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, treeMenu);
	}
}
