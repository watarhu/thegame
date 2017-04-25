package com.thegame.server.engine.intern.services;

import com.thegame.server.engine.intern.configuration.Configuration;
import com.thegame.server.engine.intern.services.impl.LocationServiceImpl;
import com.thegame.server.engine.messages.AreaMessageBean;
import com.thegame.server.persistence.LocationDao;
import com.thegame.server.persistence.entities.Area;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author afarre
 */
public class LocationServiceTest {
	
	private LocationService instance;
	
	@Before
	public void setup(){
		LocationDao mocketLocationDao=Mockito.mock(LocationDao.class);
		Area area=new Area();
		area.setId(Configuration.INITIAL_AREA.getValue());
		area.setTitle("Initial area");
		area.setShortDescription("Initial area - Short description");
		area.setDescription("Initial area - Description");
		Mockito.when(mocketLocationDao.loadAreas()).thenReturn(Stream.of(area).collect(Collectors.toList()));
		instance=new LocationServiceImpl(mocketLocationDao);
	}
	
	/**
	 * Test of getInitialArea method, of class LocationService.
	 */
	@Test
	public void testGetInitialArea() {
		System.out.println("getInitialArea");
	
		AreaMessageBean expected=new AreaMessageBean();
		expected.setId(Configuration.INITIAL_AREA.getValue());
		expected.setTitle("Initial area");
		expected.setShortDescription("Initial area - Short description");
		expected.setDescription("Initial area - Description");
		AreaMessageBean result=instance.getInitialArea();
		Assert.assertEquals(expected, result);
	}
}