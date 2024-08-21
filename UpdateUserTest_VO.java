package JDBC_VO;

import JDBC_DAO.UserDAO;

public class UpdateUserTest_VO {
	public static void main(String[] args) {
		//객체 생성
		UserDAO_VO dao = new UserDAO_VO();
		
		//회원 정보 수정
		UserVO vo = new UserVO();
		
		vo.setUser_pw("8989");
		vo.setPhone("01000000000");
		vo.setUser_id("cccc");
		dao.UpdateUser(vo);
		
		
		//회원 정보 조회
		dao.getUserList();
	}

}
