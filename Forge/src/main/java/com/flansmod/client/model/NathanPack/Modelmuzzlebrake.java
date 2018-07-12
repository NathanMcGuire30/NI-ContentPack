//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI Muzzle Brake
// Model Creator: 
// Created on: 09.09.2017 - 11:15:23
// Last changed on: 09.09.2017 - 11:15:23

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class Modelmuzzlebrake extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public Modelmuzzlebrake() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[2];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1

		attachmentModel[0].addBox(0F, 0F, 0F, 8, 2, 2, 0F); // Box 0
		attachmentModel[0].setRotationPoint(0F, -1F, -1F);

		attachmentModel[1].addShapeBox(0F, 0F, 0F, 6, 3, 6, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 1
		attachmentModel[1].setRotationPoint(1F, -1.5F, -3F);



		flipAll();
	}
}