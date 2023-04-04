package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {
	public static void main(String[] args) {

		EmpDAO empDAO = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("--------------------------------------");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("--------------------------------------");
			
			System.out.print("메뉴 입력 : ");
			int no = Integer.parseInt(sc.nextLine());
			switch (no) {
			case 1:
				
				EmpDTO empDTO = new EmpDTO();
				System.out.println("새 사원 추가");
				System.out.print("사원번호 : ");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("사원이름 : ");
				empDTO.setEname((sc.nextLine()));
				System.out.print("직무 : ");
				empDTO.setJob((sc.nextLine()));
				System.out.print("매니저번호 : ");
				empDTO.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.print("급여 : ");
				empDTO.setSal(Integer.parseInt(sc.nextLine()));
				System.out.print("추가수당 : ");
				empDTO.setComm(Integer.parseInt(sc.nextLine()));
				System.out.print("부서번호 : ");
				
				
				empDTO.setDeptno(Integer.parseInt(sc.nextLine()));
				
				System.out.println(empDAO.insert(empDTO)?"생성성공":"생성실패");
				
				
				break;
			case 2:
				System.out.print("삭제할 사번 :");
				int empno = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.remove(empno)?"삭제 성공":"삭제 실패");
				
				
				
				break;
			case 3:
				System.out.print("수정 할 직원 사번 : ");
				empno=Integer.parseInt(sc.nextLine());
				
				System.out.print("수정 할 급여 : ");
				int sal=Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(sal, empno)?"급여변경성공":"급여변경실패");
			
				
				
				break;
			case 4:
				System.out.print("사번 : ");
				empno = Integer.parseInt(sc.nextLine());
				EmpDTO row =empDAO.getRow(empno);
				if(row !=null) {
				System.out.println("\n*** 사원정보 조회 ***");
				System.out.println("사원번호 : "+row.getEmpno());
				System.out.println("사원명 : "+row.getEname());
				System.out.println("직무 : "+row.getJob());
				System.out.println("급여 : "+row.getSal());
				System.out.println("추가수당 : "+row.getComm());
				System.out.println("부서번호 : "+row.getDeptno());
				System.out.println();
				} else {
					System.out.println("사원번호를 확인해 주세요");
				}
				
				break;
			case 5:
				System.out.print("이름 : ");
				
				String ename = sc.nextLine();
				ArrayList<EmpDTO> list=empDAO.getList(ename);
				
				if(list.isEmpty()) {
					System.out.println("조회 사원이 없습니다.");
				} else {
					System.out.println();
					System.out.println("사번\t사원명\t직무\t입사일");
					System.out.println("----------------------------------------");
					for (EmpDTO empDTO1 : list) {
						System.out.print(empDTO1.getEmpno()+"\t");
						System.out.print(empDTO1.getEname()+"\t");
						System.out.print(empDTO1.getJob()+"\t");
						System.out.print(empDTO1.getHiredate()+"\n");
					}
				} 
				break;
			case 6:
				flag = false;
				sc.close();
				break;

			default:
				break;
			}
		}
		
		
		
	}
}







