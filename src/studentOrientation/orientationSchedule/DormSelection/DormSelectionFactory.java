package studentOrientation.orientationSchedule.DormSelection;

import studentOrientation.util.DormEnum;

public class DormSelectionFactory {

	/**
	 * @param dormselectionIn user choice
	 * @return DormSelection reference type
	 */
	public DormSelection submissionWay(DormEnum dormselectionIn) {
		DormSelection dormselection = null;

		try {
			if (dormselectionIn == DormEnum.PERSON) {
				dormselection = new DormSelection_Person();
			} else if (dormselectionIn == DormEnum.ONLINE_GAMING) {
				dormselection = new DormSelection_Online();
			} 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}finally{
			
		}
		return dormselection;
	}
}
