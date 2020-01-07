package admin.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.dto.Member;
import admin.dto.Subscription;
import admin.service.face.AdminService;
import admin.util.Paging;

@Controller
public class ShipmentManageController {
	
	@Autowired AdminService adminService;
	
	private static final Logger logger = LoggerFactory.getLogger(ShipmentManageController.class);
	
	@RequestMapping(value="/admin/shipment/list", method = RequestMethod.GET)
	public void shipmentList(Member member, Model model, Paging paging) {
		
		int totalCount = adminService.subMemberCntAll(paging);
		
		Paging paging2 = new Paging(totalCount, paging.getCurPage());

		List<Subscription> memberList = adminService.subMember(paging2);
		
		model.addAttribute("paging", paging2);
		model.addAttribute("list", memberList);
	}
	
}
