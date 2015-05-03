package hu.karaszi.ec.centralunit.dal;

import hu.karaszi.ec.centralunit.data.Measurement;

import java.util.List;

public interface MeasurementDataManager {
	public List<Measurement> getMeasurements(long sensorId);
	public void insertMeasurement(Measurement measurement);
}
