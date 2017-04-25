package com.thegame.server.presentation.messages;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author afarre
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerEntersRoomMessage implements IsMessage<PlayerEntersRoomMessage>{

	private LocalDateTime time;	
	private String player;
	private String from;
}
