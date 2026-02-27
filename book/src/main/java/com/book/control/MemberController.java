package com.book.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.book.DTO.MemberDTO;
import com.book.Repository.MemberRepository;

@Controller
public class MemberController {

	@Autowired
	MemberRepository memberRepository;	
	
	// 회원가입 요청(  회원가입 양식에 작성한데이터 DB 저장 요청)
	@PostMapping("/signUp")
	public String joinSave( MemberDTO memberDTO ) {
		System.out.println(  memberDTO.getEmail() );
		
		memberRepository.save(memberDTO);
		
		return "redirect:/signIn";  // 회원가입처리후 보여줄 페이지 주소
		//  redirect:  여기 뒤에는 주소만 작성하시오!!!
	}
	
	
	//회원가입 페이지 요청
	@GetMapping("/signUp")
	public String joinPage( Model model) {

// signUp.html에서 작성하는 회원가입데이터를 MemberDTO객체에
//  저장하시키기 위해서 model에 담아 html페이지에 제공한다.
		model.addAttribute("memberDTO", new MemberDTO());
		
		return "member/signUp";   
	}
	
	
	// 로그인 페이지 요청
	@GetMapping("/signIn")
	public String loginPage() {
		
		return "member/signIn";
	}
	
}


