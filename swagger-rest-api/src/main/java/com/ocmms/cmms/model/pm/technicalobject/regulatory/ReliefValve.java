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
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * = ReliefValve TODO Auto-generated class documentation
 *
 */
@Data

@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "PM_REGULATORY_RELIEFVALVE")
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public class ReliefValve extends TechnicalObject implements Serializable {


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
	@Column(name = "NOMINALPRESSURE")
	@NumberFormat
	private BigDecimal nominalPressure;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "WORKINGPRESSURE")
	@NumberFormat
	private BigDecimal workingPressure;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "SETTINGPRESSURE")
	@NumberFormat
	private BigDecimal settingPressure;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "NOMINALDIAMETER")
	@NumberFormat
	private BigDecimal nominalDiameter;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESIGNTEMPERATURE")
	@NumberFormat
	private BigDecimal designTemperature;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "WORKINGTEMPERATURE")
	@NumberFormat
	private BigDecimal workingTemperature;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CONNECTIONTYPE")
	private String connectionType;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MEDIUM")
	private String medium;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "FLUIDSTATE")
	private String fluidState;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DISCHARGELOCATION")
	private String dischargeLocation;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "MANUFACTUREDATE")
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(style = "M-")
	private Calendar manufactureDate;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "DESIGNEDSERVICELIFE")
	@NumberFormat
	private BigDecimal designedServiceLife;

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	@Column(name = "CLASSIFICATIONCATEGORY")
	private String classificationCategory;

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
		if (!(obj instanceof ReliefValve)) {
			return false;
		}
		return getId() != null && Objects.equals(getId(), ((ReliefValve) obj).getId());
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
		return "ReliefValve {lastInspectionDate='" + lastInspectionDate == null ? null
				: java.text.DateFormat.getDateTimeInstance().format(lastInspectionDate.getTime()) + '\''
						+ ", nextInspectionDate='" + nextInspectionDate == null
								? null
								: java.text.DateFormat.getDateTimeInstance().format(nextInspectionDate.getTime()) + '\''
										+ ", nominalPressure='" + nominalPressure + '\'' + ", workingPressure='"
										+ workingPressure + '\'' + ", settingPressure='" + settingPressure + '\''
										+ ", nominalDiameter='" + nominalDiameter + '\'' + ", designTemperature='"
										+ designTemperature + '\'' + ", workingTemperature='" + workingTemperature
										+ '\'' + ", connectionType='" + connectionType + '\'' + ", medium='" + medium
										+ '\'' + ", fluidState='" + fluidState + '\'' + ", dischargeLocation='"
										+ dischargeLocation + '\'' + ", manufactureDate='" + manufactureDate == null
												? null
												: java.text.DateFormat.getDateTimeInstance().format(
														manufactureDate.getTime()) + '\'' + ", designedServiceLife='"
														+ designedServiceLife + '\'' + ", classificationCategory='"
														+ classificationCategory + '\'' + "}" + super.toString();
	}
}
