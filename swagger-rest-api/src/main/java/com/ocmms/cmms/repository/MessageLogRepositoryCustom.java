package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.MessageLog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MessageLogRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MessageLogRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MessageLog> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MessageLog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
