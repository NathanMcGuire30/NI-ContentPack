//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Rail Rifle 1
// Model Creator: 
// Created on: 14.12.2018 - 15:21:52
// Last changed on: 14.12.2018 - 15:21:52

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRailRifleBarrel extends ModelAttachment //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRailRifleBarrel() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[2];
		attachmentModel[0] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 68
		attachmentModel[1] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 75

		attachmentModel[0].addBox(0F, 0F, 0F, 40, 3, 3, 0F); // Box 68
		attachmentModel[0].setRotationPoint(4F, -1F, -1.5F);

		attachmentModel[1].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 75
		attachmentModel[1].setRotationPoint(44F, -1.5F, -2F);



		flipAll();
	}
}