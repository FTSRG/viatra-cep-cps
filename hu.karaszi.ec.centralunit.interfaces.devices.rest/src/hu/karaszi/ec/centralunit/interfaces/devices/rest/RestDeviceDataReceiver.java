package hu.karaszi.ec.centralunit.interfaces.devices.rest;

import hu.karaszi.ec.centralunit.interfaces.devices.rest.dto.MeasurementDataDTO;
import hu.karaszi.ec.centralunit.interfaces.devices.rest.dto.OperationalStatusDTO;
import hu.karaszi.ec.centralunit.interfaces.devices.rest.dto.ThresholdEventDTO;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/device")
public interface RestDeviceDataReceiver {
	@POST
	@Consumes({"application/json"})
	@Path("/operationalstatus")
	public void receiveOperationalStatus(final OperationalStatusDTO data);
	
	@POST
	@Consumes({"application/json"})
	@Path("/thresholdevent/")
	public void receiveThresholdEvent(final ThresholdEventDTO data);
	
	@POST
	@Consumes({"application/json"})
	@Path("/measurementdata/")
	public void receiveMeasurementData(final MeasurementDataDTO data);
}
