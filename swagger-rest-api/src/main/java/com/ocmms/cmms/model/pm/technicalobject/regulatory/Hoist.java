package com.ocmms.cmms.model.pm.technicalobject.regulatory;

import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = Hoist TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_REGULATORY_HOIST")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class Hoist extends Equipment implements Serializable {	

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "LASTINSPECTIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar lastInspectionDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "NEXTINSPECTIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar nextInspectionDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "PARAMETER")
	private String parameter;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MANUFACTURERNAME")
	private String manufacturerName;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "INSTALLATIONDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar installationDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "ONSERVICEDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar onServiceDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

	

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
		if (!(obj instanceof Hoist)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((Hoist) obj).getId());
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
		return "Hoist {lastInspectionDate='" + lastInspectionDate == null ? null
				: java.text.DateFormat.getDateTimeInstance().format(lastInspectionDate.getTime()) + '\''
						+ ", nextInspectionDate='" + nextInspectionDate == null
								? null
								: java.text.DateFormat.getDateTimeInstance().format(nextInspectionDate.getTime()) + '\''
										+ ", parameter='" + parameter + '\'' + ", manufacturerName='" + manufacturerName
										+ '\'' + ", installationDate='" + installationDate == null
												? null
												: java.text.DateFormat.getDateTimeInstance()
														.format(installationDate.getTime()) + '\'' + ", onServiceDate='"
														+ onServiceDate == null
																? null
																: java.text.DateFormat.getDateTimeInstance()
																		.format(onServiceDate.getTime()) + '\'' + "}"
																		+ super.toString();
	}
}
