package com.ocmms.cmms.model.loto;

import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;

import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.system.RecordStatus;

import io.springlets.format.EntityFormat;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.roo.addon.jpa.annotations.audit.RooJpaAudit;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * MessageLog system message log used to save the system message
 * 
 * @author qinzeyong
 * @version v3.0.0.0
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "LOTO_LOTODETAIL", entityFormatMessage = "entity_format_message_loto_lotodetail")
@RooEquals(isJpaEntity = true)
@RooSerializable

@RooJpaAudit
public class LotoDetail {

	/**
	 * Sequence Id
	 *
	 */
	@Id
	@SequenceGenerator(name = "LotoDetailGen", sequenceName = "SEQ_LOTO_LOTODETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LotoDetailGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SOURCE")
	private String source;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POTENTIALHAZARD")
	@EntityFormat
	private PotentialHazard potentialHazard;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SOURCETAG")
	private String sourceTag;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DEVICE")
	private String device;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOTODEVICETYPE")
	@EntityFormat
	private LotoDeviceType lotoDeviceType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LOCATION")
	private String location;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "METHOD")
	private String method;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ISOLATIONMETHOD")
	@EntityFormat
	private IsolationMethod isolationMethod;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "VERIFICATION")
	private String verification;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "RETURNSERVICEORDER")
	private Integer returnServiceOrder;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOTODETAILTYPE")
	@EntityFormat
	private LotoDetailType lotoDetailType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "NOTE")
	private String note;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOTOINFO")
	@EntityFormat
	private LotoInfo lotoInfo;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "lotoDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "lotoDetail")
	@RooJpaRelation(type = JpaRelationType.AGGREGATION)
	private Set<ImageDocument> images = new HashSet<ImageDocument>();
	
	/**** General Information Generated By System Start ****/

        /**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")
	@EntityFormat
	private RecordStatus recordStatus;
        
	/**
	 * record version, while changed or updated should be plus one;
	 *
	 */
	@Version
	@Column(name = "VERSION")
	private Long version;

	/**
	 * record created date, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@CreatedDate
	private Calendar createdDate;

	/**
	 * record created user, while created record this filed will be set;
	 *
	 */
	@Column(name = "CREATED_BY")
	@CreatedBy
	private String createdBy;

	/**
	 * record update date, while update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	@LastModifiedDate
	private Calendar lastModifiedDate;

	/**
	 * Record last update user, while last update record this filed will be set;
	 *
	 */
	@Column(name = "LASTMODIFIED_BY")
	@LastModifiedBy
	private String lastModifiedBy;
	/**** General Information Generated By System End ******/
}
