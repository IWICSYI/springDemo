package com.lol.springDemo;

public class CricketCoach implements Coach{
	
	private FortuneService theFortuneService;
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}


	public CricketCoach() {
	
	}
	

	public void setTheFortuneService(FortuneService fortuneService) {
		this.theFortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Cricket Practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getFortune();
	}
	
	public void doMyMethod() {
		System.out.println("LOL");
	}
	
	public void doMyDestroy() {
		System.out.println("NO LOL");
	}

}
