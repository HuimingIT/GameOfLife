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
package org.huajistudio.gameoflife.api.event;

import javafx.stage.Stage;

public class JFXWindowEvent implements IEvent {
	private Stage stage;

	public JFXWindowEvent(Stage stage) {
		this.stage = stage;
	}

	public Stage getPane() {
		return stage;
	}

	public JFXWindowEvent setPane(Stage stage) {
		this.stage = stage;
		return this;
	}

	/**
	 * Performed when the window is opened.
	 */
	public static class OpenEvent extends JFXWindowEvent {
		public OpenEvent(Stage stage) {
			super(stage);
		}
	}

	/**
	 * Performed when the window is closed.
	 */
	public static class CloseEvent extends JFXWindowEvent {
		public CloseEvent(Stage stage) {
			super(stage);
		}
	}
}