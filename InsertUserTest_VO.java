package JDBC_VO;

import java.time.LocalDate;

public class InsertUserTest_VO {
	public static void main(String[] args) {
		// 객체 생성
		UserDAO_VO dao = new UserDAO_VO();
		
		// 회원 등록
		UserVO vo = new UserVO();
		
		vo.setUser_id("jdjd");
		vo.setUser_pw("1555");
		vo.setName("i");
		vo.setPhone("01077778888");
		LocalDate birth = LocalDate.of(2001, 7, 1);
		vo.setBirth(birth);
		
		dao.InsertUser(vo);
		
		// 목록 조회
		dao.getUserList();
	}

}
