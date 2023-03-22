package ch7;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException | MemoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			deleteTempFiles();
		}

	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다");
		}
		if(!enoughMomery()) {
			throw new MemoryException("메모리가 부족합니다");
		}
	}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMomery() {
		return true;
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
}
