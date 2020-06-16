package com.ocmms.cmms.model.mm.master;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * = ScrewElement TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_MASTER_SCREWELEMENT")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class ScrewElement extends MaterialPlantInfo implements Serializable {	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MACHINETYPE")
	private String machineType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SCREWTYPE")
	private String screwType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEMO")
	private String memo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	
}
