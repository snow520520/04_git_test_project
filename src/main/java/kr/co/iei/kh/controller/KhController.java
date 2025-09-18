package kr.co.iei.kh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.iei.kh.model.service.KhService;
import kr.co.iei.kh.model.vo.Kh;

@Controller
@RequestMapping(value="/kh")
public class KhController {
	@Autowired
	private KhService khService;
	
	@ResponseBody
	@GetMapping(value="/searchKh")
	public Kh searchKh(Kh k) {
		Kh kh = khService.searchKh(k);
		System.out.println(kh);
		return kh;
	}
}
