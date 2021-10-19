package com.noah.Main;

import org.junit.*;
import static org.junit.Assert.*;
import com.noah.Main.Main;

public class Tests {
	Main res = new Main();
	@Test
	public void testValid() {
		assertTrue(res.isValid(4388576018410707L));
	}
	
	@Test
	public void testInvalid() {
		assertFalse(res.isValid(338857601840263L));
		assertFalse(res.isValid(438857601840263L));
		assertFalse(res.isValid(43885760184107070L));
		assertFalse(res.isValid(438857684177L));
	}
}
