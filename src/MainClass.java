
public class MainClass {

	public static void main(String[] args) {
		
		/* 
		 * Qustion.1
		 * 철수의 중간고사 4과목 점수 평균이 80점을 넘으면
		 * 용돈 2배 업그레이드 해주겠다는 부모님의 말씀.
		 * 아래의 점수의 평균을 구한 후, 철수가 용돈을 2배로 받을 수 있는지 알아내시오.
		 * 단, 1과목이라도 60점 이하면 평균 이상이어도 용돈 2배는 없던 일.
		 */
		
		int	kor = 70;
		int eng = 76;
		int math = 80;
		int art = 58;
		
		boolean average = (kor >= 70) && (eng >= 70) && (math >= 70) && (art >= 70);
		
		System.out.println("철수의 중간고사 평균은 " + (kor + eng + math + art) / 4 + "점 입니다.");
		System.out.println("그러나 미술 과목이 " + average + "이므로 용돈은 그대로 입니다.");
		
		System.out.println();
		//
		
		/* 
		 * Qustion.1
		 * 엘리트 문과생인 짱구의 중간고사 수학, 과학 과목 중 한 과목이라도 70점을 넘으면
		 * 용돈 2배 업그레이드 해주겠다는 부모님의 말씀.
		 * 아래의 식을 통하여 짱구가 용돈 2배를 받을 수 있는지 알아내시오.
		 */
		
		int	math2 = 63;
		int science = 72;
		
		boolean score = (math2 >= 70) || (science >= 70);
		
		System.out.println("짱구의 수학 점수는 " + math2 + "점 입니다.");
		System.out.println("짱구의 과학 점수는 " + science + "점 이므로 용돈을 2배 받을 수 있습니다.");
		
	}

}
