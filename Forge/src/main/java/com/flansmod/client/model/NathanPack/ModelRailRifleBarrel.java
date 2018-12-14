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
		attachmentModel = new ModelRendererTurbo[9];
		attachmentModel[0] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 67
		attachmentModel[1] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 68
		attachmentModel[2] = new ModelRendererTurbo(this, 657, 9, textureX, textureY); // Box 69
		attachmentModel[3] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 70
		attachmentModel[4] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Shape 71
		attachmentModel[5] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Shape 72
		attachmentModel[6] = new ModelRendererTurbo(this, 625, 9, textureX, textureY); // Shape 73
		attachmentModel[7] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Shape 74
		attachmentModel[8] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 75

		attachmentModel[0].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 67
		attachmentModel[0].setRotationPoint(1F, -2F, 5F);
		attachmentModel[0].rotateAngleY = 3.14159265F;

		attachmentModel[1].addBox(0F, 0F, 0F, 40, 3, 3, 0F); // Box 68
		attachmentModel[1].setRotationPoint(4F, -1F, -1.5F);

		attachmentModel[2].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 69
		attachmentModel[2].setRotationPoint(1F, -3F, 4F);
		attachmentModel[2].rotateAngleY = 3.14159265F;

		attachmentModel[3].addBox(0F, 0F, 0F, 6, 4, 8, 0F); // Box 70
		attachmentModel[3].setRotationPoint(1F, 3F, 4F);
		attachmentModel[3].rotateAngleY = 3.14159265F;

		attachmentModel[4].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 4, 1, 4) }), 6, 1, 4, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,1}); // Shape 71
		attachmentModel[4].setRotationPoint(1F, 3F, 5F);
		attachmentModel[4].rotateAngleY = -1.57079633F;
		attachmentModel[4].rotateAngleZ = 3.14159265F;

		attachmentModel[5].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(0, 4, 0, 4) }), 6, 1, 4, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,1}); // Shape 72
		attachmentModel[5].setRotationPoint(1F, 3F, -4F);
		attachmentModel[5].rotateAngleY = -1.57079633F;
		attachmentModel[5].rotateAngleZ = 3.14159265F;

		attachmentModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 6, 2, 10, 4, 6, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 73
		attachmentModel[6].setRotationPoint(-5F, -3F, -4F);
		attachmentModel[6].rotateAngleY = 1.57079633F;
		attachmentModel[6].rotateAngleZ = 1.57079633F;

		attachmentModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 6, 2, 8, 4, 6, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 74
		attachmentModel[7].setRotationPoint(-5F, -2F, 5F);
		attachmentModel[7].rotateAngleY = 1.57079633F;

		attachmentModel[8].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 75
		attachmentModel[8].setRotationPoint(44F, -1.5F, -2F);



		flipAll();
	}
}