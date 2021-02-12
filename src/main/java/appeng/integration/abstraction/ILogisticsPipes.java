/*
 * This file is part of Applied Energistics 2.
 * Copyright (c) 2013 - 2015, AlgorithmX2, All rights reserved.
 *
 * Applied Energistics 2 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Applied Energistics 2 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Applied Energistics 2.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */

package appeng.integration.abstraction;


import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


/**
 * Contains pipe logic to interact between storage buses and pipes
 *
 * @author Second_Fry
 * @version rv3 01.01.2017
 * @since rv3 01.01.2017
 */
public interface ILogisticsPipes
{
	/**
	 * checks weather if the {@code te} is injectable and simulates to inject the item
	 *
	 * @param te  instanceof ILPPipe
	 * @param is  to be injected item
	 * @param dir direction of the pipe
	 * @return {@code true} if items were simulated successfully being added
	 */
	boolean canAddItemsToPipe( TileEntity te, ItemStack is, ForgeDirection dir );

	/**
	 * checks weather if the {@code te} is injectable, simulates the inject and tries to inject the item
	 *
	 * @param te  instanceof ILPPipe
	 * @param is  to be injected item
	 * @param dir direction of the pipe
	 * @return {@code true} if items were added to the buildcraft pipe
	 */
	boolean addItemsToPipe( @Nullable TileEntity te, @Nullable ItemStack is, @Nonnull ForgeDirection dir );
}