//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: ZX-11 Scope
// Model Creator: 
// Created on: 07.09.2017 - 09:15:02
// Last changed on: 07.09.2017 - 09:15:02

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSniperScope1 extends ModelAttachment //Same as Filename
{
	int textureX = 2048;
	int textureY = 512;

	public ModelSniperScope1() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[26];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 5
		attachmentModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 6
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		attachmentModel[3] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 9
		attachmentModel[4] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 11
		attachmentModel[5] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 12
		attachmentModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 13
		attachmentModel[7] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		attachmentModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 15
		attachmentModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 16
		attachmentModel[10] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 22
		attachmentModel[11] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 23
		attachmentModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 22
		attachmentModel[13] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 23
		attachmentModel[14] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 26
		attachmentModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 27
		attachmentModel[16] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 28
		attachmentModel[17] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 29
		attachmentModel[18] = new ModelRendererTurbo(this, 761, 1, textureX, textureY); // Box 30
		attachmentModel[19] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 31
		attachmentModel[20] = new ModelRendererTurbo(this, 809, 1, textureX, textureY); // Box 33
		attachmentModel[21] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 34
		attachmentModel[22] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 35
		attachmentModel[23] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 36
		attachmentModel[24] = new ModelRendererTurbo(this, 1057, 1, textureX, textureY); // Box 37
		attachmentModel[25] = new ModelRendererTurbo(this, 1145, 1, textureX, textureY); // Box 38

		attachmentModel[0].addBox(0F, 0F, 0F, 28, 4, 10, 0F); // Box 5
		attachmentModel[0].setRotationPoint(-16F, -4F, -5F);

		attachmentModel[1].addBox(0F, 0F, 0F, 2, 11, 10, 0F); // Box 6
		attachmentModel[1].setRotationPoint(12F, -11F, -5F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 8
		attachmentModel[2].setRotationPoint(12F, -3F, -5F);
		attachmentModel[2].rotateAngleX = 3.14159265F;

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		attachmentModel[3].setRotationPoint(12F, -13F, -5F);

		attachmentModel[4].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 11
		attachmentModel[4].setRotationPoint(14F, -5F, 1F);

		attachmentModel[5].addBox(0F, 0F, 0F, 16, 3, 3, 0F); // Box 12
		attachmentModel[5].setRotationPoint(14F, -5F, -4F);

		attachmentModel[6].addBox(0F, 0F, 0F, 27, 3, 3, 0F); // Box 13
		attachmentModel[6].setRotationPoint(-20F, -9F, -10F);

		attachmentModel[7].addBox(0F, 0F, 0F, 12, 1, 1, 0F); // Box 14
		attachmentModel[7].setRotationPoint(-12F, -8F, -7F);

		attachmentModel[8].addBox(0F, 0F, 0F, 3, 6, 12, 0F); // Box 15
		attachmentModel[8].setRotationPoint(-21F, -10F, -6F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		attachmentModel[9].setRotationPoint(-18F, -13F, 6F);
		attachmentModel[9].rotateAngleY = -3.14159265F;

		attachmentModel[10].addBox(0F, 0F, 0F, 5, 5, 2, 0F); // Box 22
		attachmentModel[10].setRotationPoint(6F, -9.5F, 6F);

		attachmentModel[11].addBox(0F, 0F, 0F, 5, 2, 5, 0F); // Box 23
		attachmentModel[11].setRotationPoint(6F, -15F, -2.5F);

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F, 0F, 0F, -3F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[12].setRotationPoint(-18F, -1F, -6F);
		attachmentModel[12].rotateAngleX = 3.14159265F;
		attachmentModel[12].rotateAngleY = -3.14159265F;

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 23
		attachmentModel[13].setRotationPoint(14F, -3F, 5F);
		attachmentModel[13].rotateAngleX = 3.14159265F;
		attachmentModel[13].rotateAngleY = -3.14159265F;

		attachmentModel[14].addBox(0F, 0F, 0F, 2, 4, 7, 0F); // Box 26
		attachmentModel[14].setRotationPoint(-25F, -11F, -3.5F);

		attachmentModel[15].addBox(0F, 0F, 0F, 55, 3, 6, 0F); // Box 27
		attachmentModel[15].setRotationPoint(-23F, -10.5F, -3F);

		attachmentModel[16].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		attachmentModel[16].setRotationPoint(32F, -12.5F, 3F);
		attachmentModel[16].rotateAngleY = -3.14159265F;

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 55, 2, 6, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		attachmentModel[17].setRotationPoint(-23F, -5.5F, 3F);
		attachmentModel[17].rotateAngleX = -3.14159265F;

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[18].setRotationPoint(-23F, -12F, 3.5F);
		attachmentModel[18].rotateAngleY = -3.14159265F;

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		attachmentModel[19].setRotationPoint(-25F, -6F, 3.5F);
		attachmentModel[19].rotateAngleX = 3.14159265F;

		attachmentModel[20].addBox(0F, 0F, 0F, 20, 4, 7, 0F); // Box 33
		attachmentModel[20].setRotationPoint(32F, -11F, -3.5F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		attachmentModel[21].setRotationPoint(52F, -12F, 3.5F);
		attachmentModel[21].rotateAngleY = -3.14159265F;

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 20, 1, 7, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		attachmentModel[22].setRotationPoint(32F, -6F, 3.5F);
		attachmentModel[22].rotateAngleX = 3.14159265F;

		attachmentModel[23].addBox(0F, 0F, 0F, 30, 6, 12, 0F); // Box 36
		attachmentModel[23].setRotationPoint(-18F, -10F, -6F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 30, 3, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		attachmentModel[24].setRotationPoint(12F, -13F, 6F);
		attachmentModel[24].rotateAngleY = -3.14159265F;

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 30, 3, 12, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		attachmentModel[25].setRotationPoint(-18F, -1F, 6F);
		attachmentModel[25].rotateAngleX = 3.14159265F;



		flipAll();
	}
}