package register;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberConsoleUtil {
	
	public Member getNewMember(Scanner sc) {
		//새로운 멤버 정보를 입력
		Member mem = new Member();
		
		System.out.print("id : ");
		mem.setId(sc.nextLine());

		System.out.print("name : ");
		mem.setName(sc.nextLine());
		
		System.out.print("address : ");
		mem.setAddress(sc.nextLine());
		
		System.out.print("Email : ");
		mem.setEmail(sc.nextLine());
		
		System.out.print("age : ");
		mem.setAge(Integer.parseInt(sc.nextLine()));
		
		return mem;
	}
	
	public void printAddSuccessMassage(Member member) {
		//홍길동님 회원 정보 추가 성공 메세지 출력
		
		System.out.printf("%s님 회원 정보 추가 성공 !\n",member.getName());
	}
	
	public void printMemberList(ArrayList<Member> memberList) {
		for (Member member : memberList) {
			System.out.println("아이디   이름         주소       이메일    나이");
			System.out.printf("%5s",member.getId());
			System.out.printf("%6s",member.getName());
			System.out.printf("%8s",member.getAddress());
			System.out.printf("%10s",member.getEmail());
			System.out.printf("%5d",member.getAge());
			System.out.println();
		}
	}
	
	
	public Member updateMember(Scanner sc,ArrayList<Member> mem) {
		System.out.print("id를 입력해 주세요 : ");
		String idd = sc.nextLine();
		Iterator<Member> it = mem.iterator();
		while (it.hasNext()) {
			Member member = it.next();
			
			if (idd.equals(member.getId())) {
				System.out.print("변경 할 주소 : ");
				String add = sc.nextLine();
				member.setAddress(add); 
				return member;
			}	else {
				System.out.println("id를 확인해 주세요");
			}
		}
		return null;
	}
	
	public void printUpdateSuccessMessage(Member member) {
		System.out.printf("%s님 회원 정보 수정 완료\n",member.getName());
		
	}
	
	public void printUpdateFailMessage() {
		System.out.println("회원 정보 수정에 실패하셨습니다.");
		
	}
	
	public Member removeMember(Scanner sc,ArrayList<Member> list){
		System.out.print("삭제할 아이디 : ");
		String id = sc.nextLine();
		
		for (Member member : list) {
			if (member.getId().equals(id)) {
				list.remove(member);
				return member;
			}
		}
		return null;
	}
	
	public void printRemoveSuccessMessage(Member member) {
		System.out.printf("%s님 회원 정보 삭제 완료\n",member.getName());
		
	}
	
	public void printRemoveFailMessage() {
		System.out.println("회원 정보 삭제에 실패하셨습니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
