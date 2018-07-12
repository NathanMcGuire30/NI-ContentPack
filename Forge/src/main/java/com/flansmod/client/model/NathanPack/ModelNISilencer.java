//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI Silencer
// Model Creator: 
// Created on: 09.09.2017 - 12:01:16
// Last changed on: 09.09.2017 - 12:01:16

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNISilencer extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNISilencer() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[3];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 2

		attachmentModel[0].addBox(0F, 0F, 0F, 50, 4, 12, 0F); // Box 0
		attachmentModel[0].setRotationPoint(0F, -2F, -6F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 50, 4, 12, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		attachmentModel[1].setRotationPoint(0F, -6F, -6F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 50, 4, 12, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		attachmentModel[2].setRotationPoint(0F, 6F, 6F);
		attachmentModel[2].rotateAngleX = 3.14159265F;



		flipAll();
	}
}