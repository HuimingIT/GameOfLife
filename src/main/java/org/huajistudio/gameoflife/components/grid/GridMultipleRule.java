/*
 * A game inspired from Conway's Game Of Life.
 * Copyright (C) 2016 Huaji Studio.
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.huajistudio.gameoflife.components.grid;

import org.huajistudio.gameoflife.api.components.cell.Cell;
import org.huajistudio.gameoflife.api.util.IGridMultipleRule;

/**
 * The class of the rule for multi civilizations in the grid.
 * @author Entropy_Increaser
 */
public class GridMultipleRule implements IGridMultipleRule {
	private boolean canInvade, comparingPopulation;

	/**
	 * @param canInvade If true, the old block's
	 *                  color could be changed
	 *                  directly.
	 * @param comparingPopulation about the
	 *                            invading or
	 *                            others' judgement
	 */
	public GridMultipleRule(boolean canInvade, boolean comparingPopulation) {
		this.canInvade = canInvade;
		this.comparingPopulation = comparingPopulation;
	}

	@Override
	public boolean getCanInvade() {
		return canInvade;
	}

	@Override
	public void setInvade(boolean type) {
		canInvade = type;
	}

	@Override
	public boolean getComparingPopulation() {
		return comparingPopulation;
	}

	@Override
	public void setComparingPopulation(boolean type) {
		comparingPopulation = type;
	}

	@Override
	public Cell getWinner(Cell[] surround, int[] count) {
		return null; // TODO fix the logic
	}
}
