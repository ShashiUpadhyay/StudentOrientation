package studentOrientation.orientationWorkshop;

import studentOrientation.orientationSchedule.orientationScheduleInterface;

public class OrientationWorkShop implements OrientationWorkshopInterface {
	
	/* (non-Javadoc)
	 * @see studentOrientation.OrientationWorkshop.OrientationWorkshopInterface#construct(studentOrientation.orientationSchedule.orientationScheduleInterface)
	 */
	@Override
	public void construct(orientationScheduleInterface orientationScheduleIn) {
		// TODO Auto-generated method stub
		try {
			orientationScheduleIn.performCampusTour();
			orientationScheduleIn.performDormSelection();
			orientationScheduleIn.performBookPurchase();
			orientationScheduleIn.performRegistration();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}finally{
			
		}
	}	
}
