//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Scope2
// Model Creator: 
// Created on: 07.09.2017 - 16:30:41
// Last changed on: 07.09.2017 - 16:30:41

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZX2Scope extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelZX2Scope() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[35];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 3
		attachmentModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 4
		attachmentModel[3] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Box 5
		attachmentModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 6
		attachmentModel[5] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 7
		attachmentModel[6] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 8
		attachmentModel[7] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 9
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 10
		attachmentModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 11
		attachmentModel[10] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 12
		attachmentModel[11] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 13
		attachmentModel[12] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 14
		attachmentModel[13] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 15
		attachmentModel[14] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 16
		attachmentModel[15] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 17
		attachmentModel[16] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 18
		attachmentModel[17] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 19
		attachmentModel[18] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 20
		attachmentModel[19] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 21
		attachmentModel[20] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 22
		attachmentModel[21] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 23
		attachmentModel[22] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 24
		attachmentModel[23] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 25
		attachmentModel[24] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Box 26
		attachmentModel[25] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 27
		attachmentModel[26] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 28
		attachmentModel[27] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 29
		attachmentModel[28] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 30
		attachmentModel[29] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 31
		attachmentModel[30] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 32
		attachmentModel[31] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 33
		attachmentModel[32] = new ModelRendererTurbo(this, 49, 89, textureX, textureY); // Box 34
		attachmentModel[33] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 35
		attachmentModel[34] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 36

		attachmentModel[0].addBox(0F, 0F, 0F, 100, 3, 11, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-50F, -12F, -5F);

		attachmentModel[1].addBox(0F, 0F, 0F, 100, 11, 3, 0F); // Box 3
		attachmentModel[1].setRotationPoint(-50F, -16F, -1F);

		attachmentModel[2].addShapeBox(0F, 0F, 0F, 100, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		attachmentModel[2].setRotationPoint(-50F, -16F, -5F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 100, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		attachmentModel[3].setRotationPoint(-50F, -5F, -5F);
		attachmentModel[3].rotateAngleX = 1.57079633F;

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 100, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		attachmentModel[4].setRotationPoint(-50F, -16F, 6F);
		attachmentModel[4].rotateAngleX = -1.57079633F;

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 100, 4, 4, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		attachmentModel[5].setRotationPoint(-50F, -5F, 6F);
		attachmentModel[5].rotateAngleX = -3.14159265F;

		attachmentModel[6].addBox(0F, 0F, 0F, 8, 12, 12, 0F); // Box 8
		attachmentModel[6].setRotationPoint(-4F, -16.5F, -5.5F);

		attachmentModel[7].addBox(0F, 0F, 0F, 18, 3, 13, 0F); // Box 9
		attachmentModel[7].setRotationPoint(-75F, -12F, -6F);

		attachmentModel[8].addBox(0F, 0F, 0F, 18, 13, 3, 0F); // Box 10
		attachmentModel[8].setRotationPoint(-75F, -17F, -1F);

		attachmentModel[9].addShapeBox(0F, 0F, 0F, 18, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		attachmentModel[9].setRotationPoint(-75F, -17F, 7F);
		attachmentModel[9].rotateAngleX = -1.57079633F;

		attachmentModel[10].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		attachmentModel[10].setRotationPoint(-57F, -17F, 7F);
		attachmentModel[10].rotateAngleX = -1.57079633F;

		attachmentModel[11].addShapeBox(0F, 0F, 0F, 7, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 13
		attachmentModel[11].setRotationPoint(-57F, -17F, 2F);
		attachmentModel[11].rotateAngleX = -1.57079633F;

		attachmentModel[12].addShapeBox(0F, 0F, 0F, 7, 3, 13, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 14
		attachmentModel[12].setRotationPoint(-57F, -12F, -6F);

		attachmentModel[13].addShapeBox(0F, 0F, 0F, 30, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 15
		attachmentModel[13].setRotationPoint(80F, -12F, 9F);
		attachmentModel[13].rotateAngleY = -3.14159265F;

		attachmentModel[14].addBox(0F, 0F, 0F, 15, 3, 17, 0F); // Box 16
		attachmentModel[14].setRotationPoint(80F, -12F, -8F);

		attachmentModel[15].addShapeBox(0F, 0F, 0F, 30, 3, 17, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 17
		attachmentModel[15].setRotationPoint(80F, -2F, 2F);
		attachmentModel[15].rotateAngleX = 1.57079633F;
		attachmentModel[15].rotateAngleY = -3.14159265F;

		attachmentModel[16].addBox(0F, 0F, 0F, 15, 3, 17, 0F); // Box 18
		attachmentModel[16].setRotationPoint(80F, -2F, -1F);
		attachmentModel[16].rotateAngleX = 1.57079633F;

		attachmentModel[17].addShapeBox(0F, 0F, 0F, 15, 7, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		attachmentModel[17].setRotationPoint(80F, -19F, -8F);

		attachmentModel[18].addShapeBox(0F, 0F, 0F, 15, 7, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		attachmentModel[18].setRotationPoint(80F, -2F, -8F);
		attachmentModel[18].rotateAngleX = 1.57079633F;

		attachmentModel[19].addShapeBox(0F, 0F, 0F, 15, 7, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		attachmentModel[19].setRotationPoint(80F, -2F, 9F);
		attachmentModel[19].rotateAngleX = 3.14159265F;

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 15, 7, 7, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		attachmentModel[20].setRotationPoint(80F, -19F, 9F);
		attachmentModel[20].rotateAngleX = -1.57079633F;

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 30, 7, 7, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		attachmentModel[21].setRotationPoint(50F, -2F, 9F);
		attachmentModel[21].rotateAngleX = 3.14159265F;

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 30, 7, 7, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		attachmentModel[22].setRotationPoint(50F, -2F, -8F);
		attachmentModel[22].rotateAngleX = 1.57079633F;

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 30, 7, 7, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		attachmentModel[23].setRotationPoint(50F, -19F, -8F);

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 30, 7, 7, 0F, 0F, -4F, -4F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		attachmentModel[24].setRotationPoint(50F, -19F, 9F);
		attachmentModel[24].rotateAngleX = -1.57079633F;

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		attachmentModel[25].setRotationPoint(-57F, -17F, -6F);

		attachmentModel[26].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		attachmentModel[26].setRotationPoint(-57F, -4F, -6F);
		attachmentModel[26].rotateAngleX = 1.57079633F;

		attachmentModel[27].addShapeBox(0F, 0F, 0F, 7, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -2F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		attachmentModel[27].setRotationPoint(-57F, -4F, 7F);
		attachmentModel[27].rotateAngleX = 3.14159265F;

		attachmentModel[28].addShapeBox(0F, 0F, 0F, 18, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		attachmentModel[28].setRotationPoint(-75F, -17F, -6F);

		attachmentModel[29].addShapeBox(0F, 0F, 0F, 18, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		attachmentModel[29].setRotationPoint(-75F, -4F, -6F);
		attachmentModel[29].rotateAngleX = 1.57079633F;

		attachmentModel[30].addShapeBox(0F, 0F, 0F, 18, 5, 5, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		attachmentModel[30].setRotationPoint(-75F, -4F, 7F);
		attachmentModel[30].rotateAngleX = 3.14159265F;

		attachmentModel[31].addBox(0F, 0F, 0F, 6, 6, 3, 0F); // Box 33
		attachmentModel[31].setRotationPoint(-3F, -13.5F, 6.5F);

		attachmentModel[32].addBox(0F, 0F, 0F, 6, 3, 6, 0F); // Box 34
		attachmentModel[32].setRotationPoint(-3F, -19.5F, -2.5F);

		attachmentModel[33].addBox(0F, 0F, 0F, 5, 17, 12, 0F); // Box 35
		attachmentModel[33].setRotationPoint(-16F, -16.5F, -5.5F);

		attachmentModel[34].addBox(0F, 0F, 0F, 5, 17, 12, 0F); // Box 36
		attachmentModel[34].setRotationPoint(10F, -16.5F, -5.5F);



		flipAll();
	}
}