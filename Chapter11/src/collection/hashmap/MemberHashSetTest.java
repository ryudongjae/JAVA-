package collection.hashmap;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		
		Member memberLee = new Member(100,"Lee");
		Member memberHa = new Member(200,"Ha");
		Member memberLim = new Member( 324,"Lim");
		Member memberKim = new Member( 99,"Kim");
		Member memberKim2 = new Member( 99,"Kim");
		
		
		manager.addMember(memberKim);
		manager.addMember(memberLim);
		manager.addMember(memberHa);
		manager.addMember(memberLee);
		manager.addMember(memberKim2);
		
		
		
		manager.showAllMember();
		
		
		manager.removeMember(200);
		manager.showAllMember();
	}

}
