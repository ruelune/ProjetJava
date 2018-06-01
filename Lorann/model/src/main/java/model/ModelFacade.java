package model;

import java.sql.SQLException;
import java.util.List;

public interface ModelFacade {
	
	public MovableImpl getElementByNumberAndPosition(int Level, int POs_X, int Pos_Y) throws SQLException;
	
	public MovableImpl getExampleByName(String name) throws SQLException;
	
	public List<MovableImpl> getAllExamples() throws SQLException;

}
