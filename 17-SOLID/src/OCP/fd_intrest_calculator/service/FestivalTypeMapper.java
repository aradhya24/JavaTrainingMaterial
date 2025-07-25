package OCP.fd_intrest_calculator.service;

import OCP.fd_intrest_calculator.festivalinterest.DiwaliInterest;
import OCP.fd_intrest_calculator.festivalinterest.HoliInterest;
import OCP.fd_intrest_calculator.festivalinterest.NewYearInterest;
import OCP.fd_intrest_calculator.festivalinterest.OtherInterest;
import OCP.fd_intrest_calculator.model.FestivalType;
import OCP.fd_intrest_calculator.model.IFestivalInterest;

public class FestivalTypeMapper {
	public static IFestivalInterest festivalTypeMapper(FestivalType festivalType) {

		switch (festivalType) {

		case NEWYEAR:
			return new NewYearInterest();

		case DIWALI:
			return new DiwaliInterest();

		case HOLI:
			return new HoliInterest();

		case OTHERS:
			return new OtherInterest();
		}

		return null;
	}
}
