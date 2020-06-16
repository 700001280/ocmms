package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.mdrm.MaterialDictionary;
import com.ocmms.cmms.model.mm.mdrm.QMaterialDictionary;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialDictionaryRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialDictionaryRepositoryImpl extends QueryDslRepositorySupportExt<MaterialDictionary>
		implements MaterialDictionaryRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialDictionaryRepositoryImpl() {
		super(MaterialDictionary.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLASS_ABBRIVAITION = "classAbbrivaition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROPERTY = "property";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROPERTY_DEFINITION = "propertyDefinition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CLASS = "materialClass";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String POD_SEQ = "podSeq";

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
	public static final String ITEM_REF = "itemRef";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DIRECT_MATERIAL = "directMaterial";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SFD_SEQ = "sfdSeq";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROPERTY_ABBREVIATION = "propertyAbbreviation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNSPSC = "unspsc";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNSPSC_DEFINITION = "unspscDefinition";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANDATORY_IND = "mandatoryInd";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLASS_DEFINITION = "classDefinition";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialDictionary> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialDictionary materialDictionary = QMaterialDictionary.materialDictionary;
		JPQLQuery<MaterialDictionary> query = from(materialDictionary);
		Path<?>[] paths = new Path<?>[] { materialDictionary.materialClass, materialDictionary.itemRef,
				materialDictionary.classDefinition, materialDictionary.unspsc, materialDictionary.directMaterial,
				materialDictionary.unspscDefinition, materialDictionary.classAbbrivaition, materialDictionary.property,
				materialDictionary.propertyDefinition, materialDictionary.propertyAbbreviation,
				materialDictionary.podSeq, materialDictionary.sfdSeq, materialDictionary.mandatoryInd,
				materialDictionary.recordStatus, materialDictionary.createdDate, materialDictionary.createdBy,
				materialDictionary.lastModifiedDate, materialDictionary.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CLASS, materialDictionary.materialClass)
				.map(ITEM_REF, materialDictionary.itemRef).map(CLASS_DEFINITION, materialDictionary.classDefinition)
				.map(UNSPSC, materialDictionary.unspsc).map(DIRECT_MATERIAL, materialDictionary.directMaterial)
				.map(UNSPSC_DEFINITION, materialDictionary.unspscDefinition)
				.map(CLASS_ABBRIVAITION, materialDictionary.classAbbrivaition)
				.map(PROPERTY, materialDictionary.property)
				.map(PROPERTY_DEFINITION, materialDictionary.propertyDefinition)
				.map(PROPERTY_ABBREVIATION, materialDictionary.propertyAbbreviation)
				.map(POD_SEQ, materialDictionary.podSeq).map(SFD_SEQ, materialDictionary.sfdSeq)
				.map(MANDATORY_IND, materialDictionary.mandatoryInd).map(RECORD_STATUS, materialDictionary.recordStatus)
				.map(CREATED_DATE, materialDictionary.createdDate).map(CREATED_BY, materialDictionary.createdBy)
				.map(LAST_MODIFIED_DATE, materialDictionary.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialDictionary.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialDictionary);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialDictionary> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialDictionary materialDictionary = QMaterialDictionary.materialDictionary;
		JPQLQuery<MaterialDictionary> query = from(materialDictionary);
		Path<?>[] paths = new Path<?>[] { materialDictionary.materialClass, materialDictionary.itemRef,
				materialDictionary.classDefinition, materialDictionary.unspsc, materialDictionary.directMaterial,
				materialDictionary.unspscDefinition, materialDictionary.classAbbrivaition, materialDictionary.property,
				materialDictionary.propertyDefinition, materialDictionary.propertyAbbreviation,
				materialDictionary.podSeq, materialDictionary.sfdSeq, materialDictionary.mandatoryInd,
				materialDictionary.recordStatus, materialDictionary.createdDate, materialDictionary.createdBy,
				materialDictionary.lastModifiedDate, materialDictionary.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialDictionary.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CLASS, materialDictionary.materialClass)
				.map(ITEM_REF, materialDictionary.itemRef).map(CLASS_DEFINITION, materialDictionary.classDefinition)
				.map(UNSPSC, materialDictionary.unspsc).map(DIRECT_MATERIAL, materialDictionary.directMaterial)
				.map(UNSPSC_DEFINITION, materialDictionary.unspscDefinition)
				.map(CLASS_ABBRIVAITION, materialDictionary.classAbbrivaition)
				.map(PROPERTY, materialDictionary.property)
				.map(PROPERTY_DEFINITION, materialDictionary.propertyDefinition)
				.map(PROPERTY_ABBREVIATION, materialDictionary.propertyAbbreviation)
				.map(POD_SEQ, materialDictionary.podSeq).map(SFD_SEQ, materialDictionary.sfdSeq)
				.map(MANDATORY_IND, materialDictionary.mandatoryInd).map(RECORD_STATUS, materialDictionary.recordStatus)
				.map(CREATED_DATE, materialDictionary.createdDate).map(CREATED_BY, materialDictionary.createdBy)
				.map(LAST_MODIFIED_DATE, materialDictionary.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialDictionary.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialDictionary);
	}
}
