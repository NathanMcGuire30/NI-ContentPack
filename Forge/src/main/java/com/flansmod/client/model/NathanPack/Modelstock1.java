//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Standard Stock
// Model Creator: 
// Created on: 10.09.2017 - 12:38:53
// Last changed on: 10.09.2017 - 12:38:53

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelstock1 extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelstock1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[2];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 3

		attachmentModel[0].addBox(0F, 0F, 0F, 3, 16, 6, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-28F, -2F, -3F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 25, 16, 6, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, -0.5F, 0F, -11F, -0.5F, 0F, 0F, 0F); // Box 3
		attachmentModel[1].setRotationPoint(-25F, -2F, -3F);



		flipAll();
	}
}