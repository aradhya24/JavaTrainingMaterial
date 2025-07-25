package OCP.fd_intrest_calculator.service;

import OCP.fd_intrest_calculator.model.FixedDeposit;

public class FDsDisplayService {

	public static void getFDs() {
		for (FixedDeposit fixedDeposit : FDInputService.list) {
			System.out.println("-----------------------------------------------------");
			System.out.println("Account Number : " + fixedDeposit.getAccountNumber());
			System.out.println("Name : " + fixedDeposit.getName());
			System.out.println("Duration : " + fixedDeposit.getDuration());
			System.out.println("Principal Amount : " + fixedDeposit.getPrincipal());
			System.out.println("Festival Type : " + fixedDeposit.getFestivalType());
			System.out.println("Festival Interest rate : "
					+ FestivalTypeMapper.festivalTypeMapper(fixedDeposit.getFestivalType()).getInterestRate());
			System.out.println("Intrested amount : " + fixedDeposit
					.calculateSimpleInterest(FestivalTypeMapper.festivalTypeMapper(fixedDeposit.getFestivalType())));
			System.out.println("Final amount : " + (fixedDeposit.getPrincipal() + fixedDeposit
					.calculateSimpleInterest(FestivalTypeMapper.festivalTypeMapper(fixedDeposit.getFestivalType()))));
		}
	}
}
