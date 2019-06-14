package com.hex.clarity.core.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.InvestmentMaster;
import com.hex.clarity.core.entity.ListOfValues;
import com.hex.clarity.core.enums.ErrorMessage;
import com.hex.clarity.core.exception.ClarityErrorHandler;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.repository.InvestmentRepository;
import com.hex.clarity.core.service.InvestmentService;

@Service("investmentService")
@Transactional
public class InvestmentServiceImpl implements InvestmentService {
	private static final Logger log = LoggerFactory.getLogger(InvestmentServiceImpl.class);

	@Autowired
	private InvestmentRepository investmentRepository;
	
	@Autowired
	private ClarityErrorHandler errorHandler;

	@Override
	public String addInvestmentDetails(InvestmentMaster investment) {

		String response = ClarityConstants.FAILED;
		try {

			if (investment != null) {
				InvestmentMaster investmaster = null;
				investmaster = investmentRepository.save(investment);
				if (null != investmaster) {
					response = ClarityConstants.SUCCESS;
				}
			} else {
				throw new ClarityException(ErrorMessage.SAVE_FAILED);
			}
		} catch (ClarityException e) {
			String msg = errorHandler.buildMessage(e);
			log.info(msg);
		}

		return response;
	}

	@Override
	public List<String> getInvestmentTypeList() {
		List<ListOfValues> investmentTypeList = null;
		List<String> investmentTypeLists = new ArrayList<>();
		investmentTypeList = investmentRepository.getInvestmentTypeList("investment_type");
		if (investmentTypeList.size() > 0) {
			for (ListOfValues lov : investmentTypeList) {
				investmentTypeLists.add(lov.getList_value());
			}
			return investmentTypeLists;
		}

		return investmentTypeLists;
	}

	@Override
	public List<InvestmentMaster> getInvestmentList() {
		Iterable<InvestmentMaster> investmentList = null;
		List<InvestmentMaster> investmentListValues = new ArrayList<>();
		investmentList = investmentRepository.findAll();
		if (investmentList != null) {
			investmentList.forEach(investmentListValues::add);
			return investmentListValues;
		}

		return investmentListValues;
	}

}
