//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NIHoloSight
// Model Creator: 
// Created on: 04.08.2018 - 20:25:41
// Last changed on: 04.08.2018 - 20:25:41

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIHoloSight extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNIHoloSight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[16];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		attachmentModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box8
		attachmentModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import Box9
		attachmentModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Box10
		attachmentModel[4] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Import Box11
		attachmentModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Import Box19
		attachmentModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box20
		attachmentModel[7] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Import Box22
		attachmentModel[8] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box23
		attachmentModel[9] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Import Box11
		attachmentModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box13
		attachmentModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Import Box16
		attachmentModel[12] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Import Box21
		attachmentModel[13] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 0
		attachmentModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Shape 1
		attachmentModel[15] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Shape 2

		attachmentModel[0].addBox(0F, 0F, 0F, 30, 1, 16, 0F); // Import Box0
		attachmentModel[0].setRotationPoint(-14F, -1F, -8F);

		attachmentModel[1].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Import Box8
		attachmentModel[1].setRotationPoint(0F, -25F, -9F);

		attachmentModel[2].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Import Box9
		attachmentModel[2].setRotationPoint(0F, -25F, 2F);

		attachmentModel[3].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Import Box10
		attachmentModel[3].setRotationPoint(0F, -22.5F, -0.5F);

		attachmentModel[4].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Import Box11
		attachmentModel[4].setRotationPoint(0F, -33.5F, -0.5F);

		attachmentModel[5].addBox(0F, 0F, 0F, 10, 2, 70, 0F); // Import Box19
		attachmentModel[5].setRotationPoint(-5F, -43F, -35F);

		attachmentModel[6].addBox(0F, 0F, 0F, 10, 2, 70, 0F); // Import Box20
		attachmentModel[6].setRotationPoint(-5F, -8F, -35F);

		attachmentModel[7].addShapeBox(0F, 0F, 0F, 10, 37, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box22
		attachmentModel[7].setRotationPoint(-5F, -43F, 35F);

		attachmentModel[8].addShapeBox(0F, 0F, 0F, 10, 37, 2, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box23
		attachmentModel[8].setRotationPoint(-5F, -43F, -37F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 10, 3, 30, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box11
		attachmentModel[9].setRotationPoint(-5F, -46F, -15F);

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 66, 6, 30, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box13
		attachmentModel[10].setRotationPoint(-37F, -7F, -15F);

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box16
		attachmentModel[11].setRotationPoint(-39F, -8F, -11F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 8, 1, 22, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box21
		attachmentModel[12].setRotationPoint(-22F, -8F, -11F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 4, 6, 30, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 0
		attachmentModel[13].setRotationPoint(-41F, -7F, -15F);

		attachmentModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(5, 2, 5, 2), new Coord2D(5, 8, 5, 8), new Coord2D(3, 10, 3, 10), new Coord2D(0, 10, 0, 10) }), 1, 5, 10, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,3 ,3 ,6 ,3 ,3}); // Shape 1
		attachmentModel[14].setRotationPoint(-34F, -8F, 12F);
		attachmentModel[14].rotateAngleX = 1.57079633F;

		attachmentModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(5, 2, 5, 2), new Coord2D(5, 8, 5, 8), new Coord2D(3, 10, 3, 10), new Coord2D(0, 10, 0, 10) }), 1, 5, 10, 28, 1, ModelRendererTurbo.MR_FRONT, new float[] {10 ,3 ,3 ,6 ,3 ,3}); // Shape 2
		attachmentModel[15].setRotationPoint(-34F, -7F, 12F);
		attachmentModel[15].rotateAngleX = 1.57079633F;
		attachmentModel[15].rotateAngleZ = -3.14159265F;



		flipAll();
	}
}