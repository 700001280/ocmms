package com.ocmms.cmms.model.mm.procurement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.common.Currency;
import com.ocmms.cmms.model.common.UnitOfMeasure;
import com.ocmms.cmms.model.edm.Document;
import com.ocmms.cmms.model.edm.ImageDocument;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.system.RecordStatus;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.DecimalMin;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.util.Assert;

/**
 * = ProcurementItemDetail TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "MM_PROCUREMENT_ITEMDETAIL")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class ProcurementItemDetail implements Serializable {

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Id
	@SequenceGenerator(name = "procurementItemDetailGen", sequenceName = "SEQ_MM_PROCUREMENT_ITEMDETAIL_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "procurementItemDetailGen")
	@Column(name = "ID")
	private Long id;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROCUREMENTREQUEST")

	private ProcurementRequest procurementRequest;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROCUREMENTORDER")

	private ProcurementOrder procurementOrder;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REQUESTER")

	private Employee requester;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PRNUMBER")
	private String prNumber;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PONUMBER")
	private String poNumber;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MATERIAL")
	private String material;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SUBMITDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar submitDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "QUANTITY", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	@DecimalMin("0.00")
	private BigDecimal quantity;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UOM")

	private UnitOfMeasure uom;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organization")

	private Organization organization;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "UNITPRICE", columnDefinition = "Decimal(10,2) default '0.00'")
	@NumberFormat
	@DecimalMin("0.00")
	private BigDecimal unitPrice;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CURRENCYUNIT")

	private Currency currencyUnit;

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
	@Column(name = "CLOSED")
	private Boolean closed;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementItemDetail")

	private Set<Document> documents = new HashSet<Document>();

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@OneToMany(cascade = { javax.persistence.CascadeType.MERGE,
			javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "procurementItemDetail")

	private Set<ImageDocument> images = new HashSet<ImageDocument>();

	/**** General Information Generated By System Start ****/
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RECORDSTATUS")

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

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	

	/**
	 * This `equals` implementation is specific for JPA entities and uses the entity
	 * identifier for it, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @param obj
	 * @return Boolean
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// instanceof is false if the instance is null
		if (!(obj instanceof ProcurementItemDetail)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((ProcurementItemDetail) obj).getId());
	}

	/**
	 * This `hashCode` implementation is specific for JPA entities and uses a fixed
	 * `int` value to be able to identify the entity in collections after a new id
	 * is assigned to the entity, following the article in
	 * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
	 *
	 * @return Integer
	 */
	public int hashCode() {
		return 31;
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @return String
	 */
	public String toString() {
		return "ProcurementItemDetail {" + "id='" + id + '\'' + ", prNumber='" + prNumber + '\'' + ", poNumber='"
				+ poNumber + '\'' + ", material='" + material + '\'' + ", submitDate='" + submitDate == null
						? null
						: java.text.DateFormat.getDateTimeInstance().format(submitDate.getTime()) + '\''
								+ ", quantity='" + quantity + '\'' + ", unitPrice='" + unitPrice + '\'' + ", memo='"
								+ memo + '\'' + ", closed='" + closed + '\'' + ", version='" + version + '\''
								+ ", createdDate='" + createdDate == null
										? null
										: java.text.DateFormat.getDateTimeInstance().format(createdDate.getTime())
												+ '\'' + ", createdBy='" + createdBy + '\'' + ", lastModifiedDate='"
												+ lastModifiedDate == null
														? null
														: java.text.DateFormat.getDateTimeInstance()
																.format(lastModifiedDate.getTime()) + '\''
																+ ", lastModifiedBy='" + lastModifiedBy + '\'' + "}"
																+ super.toString();
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToAdd
	 */
	public void addToDocuments(Iterable<Document> documentsToAdd) {
		Assert.notNull(documentsToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToAdd) {
			this.documents.add(item);
			item.setProcurementItemDetail(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param documentsToRemove
	 */
	public void removeFromDocuments(Iterable<Document> documentsToRemove) {
		Assert.notNull(documentsToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (Document item : documentsToRemove) {
			this.documents.remove(item);
			item.setProcurementItemDetail(null);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToAdd
	 */
	public void addToImages(Iterable<ImageDocument> imagesToAdd) {
		Assert.notNull(imagesToAdd, ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToAdd) {
			this.images.add(item);
			item.setProcurementItemDetail(this);
		}
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param imagesToRemove
	 */
	public void removeFromImages(Iterable<ImageDocument> imagesToRemove) {
		Assert.notNull(imagesToRemove, ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE);
		for (ImageDocument item : imagesToRemove) {
			this.images.remove(item);
			item.setProcurementItemDetail(null);
		}
	}
}
