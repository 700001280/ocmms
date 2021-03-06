// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import com.ocmms.cmms.model.mm.storage.MovementType;
import com.ocmms.cmms.model.mm.storage.QInstockDetail;
import com.ocmms.cmms.model.mm.storage.StorageLocation;
import com.ocmms.cmms.model.mm.storage.StorageType;
import com.ocmms.cmms.repository.InstockDetailRepositoryImpl;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

privileged aspect InstockDetailRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare @type: InstockDetailRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.MATERIAL_CATALOG = "materialCatalog";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.STORAGE_LOCATION = "storageLocation";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.QUANTITY = "quantity";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.STORAGE_TYPE = "storageType";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.MOVEMENT_TYPE = "movementType";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.GOOD_RECEIVE_NO = "goodReceiveNo";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.RECEIVE_DATE = "receiveDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.EXPIRATION_DATE = "expirationDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.SERIAL_NUMBER = "serialNumber";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.RECEIVER = "receiver";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.KEEPER = "keeper";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.MEMO = "memo";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.CLOSED = "closed";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.RECORD_STATUS = "recordStatus";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.CREATED_DATE = "createdDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.CREATED_BY = "createdBy";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.LAST_MODIFIED_DATE = "lastModifiedDate";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String InstockDetailRepositoryImpl.LAST_MODIFIED_BY = "lastModifiedBy";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param ids
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        // Also, filter by the provided ids
        query.where(instockDetail.id.in(ids));
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param materialCatalog
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findByMaterialCatalog(MaterialCatalog materialCatalog, GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Assert.notNull(materialCatalog, "materialCatalog is required");
        
        query.where(instockDetail.materialCatalog.eq(materialCatalog));
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param movementType
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findByMovementType(MovementType movementType, GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Assert.notNull(movementType, "movementType is required");
        
        query.where(instockDetail.movementType.eq(movementType));
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageLocation
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findByStorageLocation(StorageLocation storageLocation, GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Assert.notNull(storageLocation, "storageLocation is required");
        
        query.where(instockDetail.storageLocation.eq(storageLocation));
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param storageType
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<InstockDetail> InstockDetailRepositoryImpl.findByStorageType(StorageType storageType, GlobalSearch globalSearch, Pageable pageable) {
        
        QInstockDetail instockDetail = QInstockDetail.instockDetail;
        
        JPQLQuery<InstockDetail> query = from(instockDetail);
        
        Assert.notNull(storageType, "storageType is required");
        
        query.where(instockDetail.storageType.eq(storageType));
        Path<?>[] paths = new Path<?>[] {instockDetail.materialCatalog,instockDetail.storageLocation,instockDetail.quantity,instockDetail.storageType,instockDetail.movementType,instockDetail.goodReceiveNo,instockDetail.receiveDate,instockDetail.expirationDate,instockDetail.serialNumber,instockDetail.receiver,instockDetail.keeper,instockDetail.memo,instockDetail.closed,instockDetail.recordStatus,instockDetail.createdDate,instockDetail.createdBy,instockDetail.lastModifiedDate,instockDetail.lastModifiedBy};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(MATERIAL_CATALOG, instockDetail.materialCatalog)
			.map(STORAGE_LOCATION, instockDetail.storageLocation)
			.map(QUANTITY, instockDetail.quantity)
			.map(STORAGE_TYPE, instockDetail.storageType)
			.map(MOVEMENT_TYPE, instockDetail.movementType)
			.map(GOOD_RECEIVE_NO, instockDetail.goodReceiveNo)
			.map(RECEIVE_DATE, instockDetail.receiveDate)
			.map(EXPIRATION_DATE, instockDetail.expirationDate)
			.map(SERIAL_NUMBER, instockDetail.serialNumber)
			.map(RECEIVER, instockDetail.receiver)
			.map(KEEPER, instockDetail.keeper)
			.map(MEMO, instockDetail.memo)
			.map(CLOSED, instockDetail.closed)
			.map(RECORD_STATUS, instockDetail.recordStatus)
			.map(CREATED_DATE, instockDetail.createdDate)
			.map(CREATED_BY, instockDetail.createdBy)
			.map(LAST_MODIFIED_DATE, instockDetail.lastModifiedDate)
			.map(LAST_MODIFIED_BY, instockDetail.lastModifiedBy);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, instockDetail);
    }
    
}
