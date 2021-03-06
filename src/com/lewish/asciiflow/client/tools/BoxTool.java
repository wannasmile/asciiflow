package com.lewish.asciiflow.client.tools;

import com.google.gwt.resources.client.ImageResource;
import com.google.inject.Inject;
import com.lewish.asciiflow.client.Canvas;
import com.lewish.asciiflow.client.HistoryManager;
import com.lewish.asciiflow.client.common.Box;
import com.lewish.asciiflow.client.resources.AsciiflowClientBundle;

public class BoxTool extends BaseBoxTool {

	@Inject
	public BoxTool(Canvas canvas, HistoryManager historyManager, AsciiflowClientBundle clientBundle) {
		super(canvas, historyManager, clientBundle);
	}

	@Override
	public String getLabel() {
		return "Box";
	}

	@Override
	public void draw(Box box) {
		draw(box, canvas, false);
	}

	@Override
	public String getDescription() {
		return "Click and drag to draw a box";
	}

	@Override
	public ImageResource getImageResource() {
		return clientBundle.boxToolImage();
	}
}
