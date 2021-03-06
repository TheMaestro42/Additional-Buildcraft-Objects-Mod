/** 
 * Copyright (C) 2011 Flow86
 * 
 * AdditionalBuildcraftObjects is open-source.
 *
 * It is distributed under the terms of my Open Source License. 
 * It grants rights to read, modify, compile or run the code. 
 * It does *NOT* grant the right to redistribute this software or its 
 * modifications in any form, binary or source, except if expressively
 * granted by the copyright holder.
 */

package net.minecraft.src.AdditionalBuildcraftObjects;

import java.util.LinkedList;

import net.minecraft.src.Block;
import net.minecraft.src.TileEntity;
import net.minecraft.src.buildcraft.api.IPipe;
import net.minecraft.src.buildcraft.api.ITriggerProvider;
import net.minecraft.src.buildcraft.api.Trigger;
import net.minecraft.src.buildcraft.energy.TileEngine;

/**
 * @author Flow86
 * 
 */
public class ABOTriggerProvider implements ITriggerProvider {

	@Override
	public LinkedList<Trigger> getPipeTriggers(IPipe pipe) {
		return new LinkedList<Trigger>();
	}

	@Override
	public LinkedList<Trigger> getNeighborTriggers(Block block, TileEntity tile) {
		LinkedList<Trigger> result = new LinkedList<Trigger>();

		if (tile instanceof TileEngine) {
			result.add(ABO.triggerEngineControl);
		}

		return result;
	}

}
