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
public class MoveMessage implements IsMessage<MoveMessage>{

	public LocalDateTime time;	
	public String sender;
	public String direction;
}