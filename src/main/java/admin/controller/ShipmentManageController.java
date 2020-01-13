package admin.controller;



import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.dto.Book;
import admin.dto.Member;
import admin.dto.Shipment;
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
//		List<Shipment> shipment2 = adminService.checkShipment(paging);
		logger.info("checkShipment ####@@@@@@ : " + memberList);
		
		model.addAttribute("paging", paging2);
		model.addAttribute("list", memberList);
	}
	
	@RequestMapping(value="/admin/shipment/list", method = RequestMethod.POST)
	public void shipment(Member member, Model model, Shipment shipment, Subscription subscription, Paging paging) {
		
		logger.info("배송멤버 넘버 @ : "+member);
		
		// 넘겨받은 memberNo으로 genre 조회
		member = adminService.getGenre(member);
		logger.info("멤버 넘버에 따른 장르 : " + member);
		
		//장르 일치에 따른 book 가져오기(1개)
		Book bookInfo = adminService.getBookGenreNo(member);
		
		logger.info("북잘가져옴??? : " + bookInfo );
		
		Random rand = new Random();
		int shipNo = 100000000 + rand.nextInt(900000000);
		//shipno(운송장 번호 - 대한통운)
		
		// 운송장번호 ; 있는거로 하나 만들기 shipno
		shipment.setShipNo(shipNo);
		
		// shipment 테이블에 book 입력
		shipment.setBookNo(bookInfo.getBookNo());
		
		
		// date  = service에서 만들기
		LocalDateTime date = LocalDateTime.now();
		shipment.setShipmentDate(date.toString());
		
		// memberno = 로그인한얘 no
		shipment.setMemberNo(member.getMemberNo());
		logger.info("배송 정보 저장 멤버넘 : " + shipment.getMemberNo());
		
		// subNo = 구독정보 가져오기
		logger.info("멤버 섭 넘!!!!!!!!  : " + member.getSubNo());
		shipment.setSubNo(member.getSubNo());
		
		adminService.insertShipmentInfo(shipment);
		
		int totalCount = adminService.subMemberCntAll(paging);
		
//		shipment = adminService.checkShipment(paging);		
		
//		logger.info("멀까요오옹 :" +shipment2);
//		System.out.println("멀까요오옹 :" +shipment2);
		
//		if(checkShipment==1) {
//			Paging paging2 = new Paging(totalCount, paging.getCurPage());
//			List<Subscription> memberList = adminService.subMember(paging2);
//			model.addAttribute("paging", paging2);
//			model.addAttribute("list", memberList);
//		
//		}
		
				
	}
	
	
	@RequestMapping(value = "/admin/shipment/checkpage", method = RequestMethod.GET)
	public void checkShipment(Shipment shipment, Model model, Subscription subscription, Member member) {
		
		List<Shipment> shipmentInfoList = adminService.shipmentInfo(shipment);
		
		model.addAttribute("shipment", shipmentInfoList);
	}
}
