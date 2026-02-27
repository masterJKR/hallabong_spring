package com.book.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.book.BookApplication;
import com.book.DTO.TestInfo;
import com.book.Entity.Board;
import com.book.Entity.User;
import com.book.Repository.BoardRepository;
import com.book.Repository.UserRepository;

@Controller
public class TestController {

	//  Autowired는 인터페이스를 구현한 실제 객체를 대신 연결해주는 기술 
	@Autowired
	BoardRepository boardRepository;

	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("/form")
	public String test(Model model) {
		
		model.addAttribute("name", "김철수");
		model.addAttribute("age", 34);
		
		model.addAttribute("testInfo", new TestInfo());
		
		return "form";
	}
	
    
    @GetMapping("/userlist")
    public String userList( Model model) {
    	List<User> userList = userRepository.findAll();
    	
    	model.addAttribute("data" , userList);
    	return "users";
    }
    
    
	@GetMapping("/freeboard")
	public String bb( Model model ) {
		List<Board> boardList = boardRepository.findAll();
		// html 페이지에 자바의 데이터를 출력하려면 Model에 담아줘야한다.
	
		model.addAttribute("list",  boardList);
		
		return "board";
	}
	
	
	
	//   localhost/   ->  index.html
//	@GetMapping("/")
//	public String home( Model model) {
//		model.addAttribute("name",  "이순신");
//		return "index";
//	}
	
	
	
	// localhost/test   ->  test.html
	@GetMapping("/test")
	public String aaa() {
		return "test.html";
	}
	
	// localhost/enter   -> test2.html
	@GetMapping("/enter")
	public String userEnter() {
		return "test2.html";
	}
	
}

// mybatis  
//  마이 바티스는  ORM 프레임워크이다.  
//  ORM 은  object(객체) relation(테이블) 을 말한다.
//  객체와 테이블을 자동으로 연결해주는 기술  
//  SQL 직접 작성
//  복잡한 쿼리나  join,  튜닝을 많이 하는경우 사용하면 좋다.
//  XML을 활용하여  객체와 테이블을 연결한다.

// 동작 원리
//  spring이  Mapper 인터페이스를 확인
//  mybatis가 해당 인터페이스의 구현체를 자동으로 생성
//   메서드 호출시  XML의 쿼리문 실행 하고 결과를 DTO에 매핑





//  Model  ,  ModelAndView  
//  Model은 데이터만 담아주는 역할
//  ModelAndView는 데이터와 페이지를 담아주는 역할

//  ModelAndView를 사용하면  디스패처서블릿 에서  그냥 사용하지만
//  Model을 사용하면  디스패처서블릿이 Model의 데이터와 return의
//   view를 합쳐서  ModelAndView로 변환 한다.  



// 스프링에서는  서블릿 클래스라고 직접 만들지 않는다. 
// 기존의 서블릿 클래스의 역할이  주소 매핑이다.  
//  서블릿 클래스와 같은  주소매핑하고 해당주소에 페이지를 제공하는방법은
//  일반 클래스를 만들고 클래스이름 위에  애노테이션 @Controller 
//  를 붙여주면  해당 클래스가 서블릿클래스 처럼 사용가능해진다.




