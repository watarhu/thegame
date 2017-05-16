package com.thegame.server.data.loader.beans;

import java.util.Optional;

/**
 *
 * @author afarre
 */
public class RaceImportTest extends BaseImportTest{
	
	public RaceImportTest() {
		super("race");
	}
	@Override
	public Optional<Object> getBean(String _jsonFile) {
		
		Optional<Object> reply=Optional.empty();
		
		if("race.json".equals(_jsonFile)){
			reply=Optional.of(RaceImport.builder()
									.id("goblin")
									.singular("goblin")
									.plural("goblins")
									.healthBase(15)
									.healthPerLevel(3)
									.magicBase(0)
									.magicPerLevel(0.5)
									.chatter("Vicavorausan or deaavh!")
									.chatter("Inavruderuk, drepa avhem!")
									.chatter("Proavecav avhe milambak!")
									.chatter("Nalkroro ayh lat doaumn avhiuk avo uuk?")
									.chatter("Senav avhem avo avheir goddeukuk")
									.build());
		} 
 
		return reply;
	}
}
