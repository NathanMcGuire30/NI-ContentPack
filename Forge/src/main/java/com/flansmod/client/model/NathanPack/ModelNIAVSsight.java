//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2017 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: NI Advanced Gunsight
// Model Creator: 
// Created on: 07.09.2017 - 17:17:33
// Last changed on: 07.09.2017 - 17:17:33

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNIAVSsight extends ModelAttachment //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelNIAVSsight() //Same as Filename
	{
		attachmentModel = new ModelRendererTurbo[48];
		attachmentModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		attachmentModel[1] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 1
		attachmentModel[2] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 2
		attachmentModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 3
		attachmentModel[4] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 4
		attachmentModel[5] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 5
		attachmentModel[6] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 6
		attachmentModel[7] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 7
		attachmentModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 8
		attachmentModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 9
		attachmentModel[10] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 10
		attachmentModel[11] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 11
		attachmentModel[12] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 12
		attachmentModel[13] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 13
		attachmentModel[14] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 14
		attachmentModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 15
		attachmentModel[16] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 16
		attachmentModel[17] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 17
		attachmentModel[18] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Box 18
		attachmentModel[19] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 19
		attachmentModel[20] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 21
		attachmentModel[21] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 22
		attachmentModel[22] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 23
		attachmentModel[23] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 24
		attachmentModel[24] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 25
		attachmentModel[25] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 26
		attachmentModel[26] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 27
		attachmentModel[27] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 28
		attachmentModel[28] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 29
		attachmentModel[29] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 30
		attachmentModel[30] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 31
		attachmentModel[31] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 32
		attachmentModel[32] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 33
		attachmentModel[33] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Box 34
		attachmentModel[34] = new ModelRendererTurbo(this, 321, 137, textureX, textureY); // Box 35
		attachmentModel[35] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 36
		attachmentModel[36] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 37
		attachmentModel[37] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 38
		attachmentModel[38] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 39
		attachmentModel[39] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 40
		attachmentModel[40] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 41
		attachmentModel[41] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 42
		attachmentModel[42] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 43
		attachmentModel[43] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 44
		attachmentModel[44] = new ModelRendererTurbo(this, 321, 177, textureX, textureY); // Box 45
		attachmentModel[45] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 46
		attachmentModel[46] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 47
		attachmentModel[47] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 48

		attachmentModel[0].addBox(0F, 0F, 0F, 70, 2, 30, 0F); // Box 0
		attachmentModel[0].setRotationPoint(-55F, -2F, -15F);

		attachmentModel[1].addBox(0F, 0F, 0F, 70, 30, 1, 0F); // Box 1
		attachmentModel[1].setRotationPoint(-55F, -40F, -24F);

		attachmentModel[2].addBox(0F, 0F, 0F, 70, 1, 30, 0F); // Box 2
		attachmentModel[2].setRotationPoint(-55F, -49F, -15F);

		attachmentModel[3].addShapeBox(0F, 0F, 0F, 70, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 3
		attachmentModel[3].setRotationPoint(-55F, -10F, -24F);

		attachmentModel[4].addShapeBox(0F, 0F, 0F, 70, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 4
		attachmentModel[4].setRotationPoint(-55F, -49F, -15F);
		attachmentModel[4].rotateAngleX = -1.57079633F;

		attachmentModel[5].addShapeBox(0F, 0F, 0F, 70, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 5
		attachmentModel[5].setRotationPoint(-55F, -1F, 15F);
		attachmentModel[5].rotateAngleX = 1.57079633F;

		attachmentModel[6].addShapeBox(0F, 0F, 0F, 70, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 6
		attachmentModel[6].setRotationPoint(-55F, -40F, 24F);
		attachmentModel[6].rotateAngleX = 3.14159265F;

		attachmentModel[7].addBox(0F, 0F, 0F, 70, 30, 1, 0F); // Box 7
		attachmentModel[7].setRotationPoint(-55F, -40F, 23F);

		attachmentModel[8].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 8
		attachmentModel[8].setRotationPoint(-50F, -25F, -9F);

		attachmentModel[9].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 9
		attachmentModel[9].setRotationPoint(-50F, -25F, 2F);

		attachmentModel[10].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 10
		attachmentModel[10].setRotationPoint(-50F, -22.5F, -0.5F);

		attachmentModel[11].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 11
		attachmentModel[11].setRotationPoint(-50F, -33.5F, -0.5F);

		attachmentModel[12].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 12
		attachmentModel[12].setRotationPoint(49F, -33F, -0.5F);

		attachmentModel[13].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 13
		attachmentModel[13].setRotationPoint(49F, -25F, -8.5F);

		attachmentModel[14].addBox(0F, 0F, 0F, 0, 1, 7, 0F); // Box 14
		attachmentModel[14].setRotationPoint(49F, -25F, 1.5F);

		attachmentModel[15].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 15
		attachmentModel[15].setRotationPoint(49F, -23F, -0.5F);

		attachmentModel[16].addBox(0F, 0F, 0F, 15, 1, 22, 0F); // Box 16
		attachmentModel[16].setRotationPoint(-80F, -6F, -11F);

		attachmentModel[17].addBox(0F, 0F, 0F, 15, 22, 1, 0F); // Box 17
		attachmentModel[17].setRotationPoint(-80F, -36F, -20F);

		attachmentModel[18].addBox(0F, 0F, 0F, 15, 22, 1, 0F); // Box 18
		attachmentModel[18].setRotationPoint(-80F, -36F, 19F);

		attachmentModel[19].addBox(0F, 0F, 0F, 15, 1, 22, 0F); // Box 19
		attachmentModel[19].setRotationPoint(-80F, -45F, -11F);

		attachmentModel[20].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 21
		attachmentModel[20].setRotationPoint(-65F, -49F, -15F);

		attachmentModel[21].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 22
		attachmentModel[21].setRotationPoint(-65F, -10F, -24F);
		attachmentModel[21].rotateAngleX = 1.57079633F;

		attachmentModel[22].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 23
		attachmentModel[22].setRotationPoint(-65F, -1F, 15F);
		attachmentModel[22].rotateAngleX = 3.14159265F;

		attachmentModel[23].addShapeBox(0F, 0F, 0F, 10, 5, 30, 0F, 0F, -4F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -4F, 0F, 0F, -4F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -4F); // Box 24
		attachmentModel[23].setRotationPoint(-65F, -40F, 24F);
		attachmentModel[23].rotateAngleX = -1.57079633F;

		attachmentModel[24].addShapeBox(0F, 0F, 0F, 15, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 25
		attachmentModel[24].setRotationPoint(-80F, -36F, 20F);
		attachmentModel[24].rotateAngleX = 3.14159265F;

		attachmentModel[25].addShapeBox(0F, 0F, 0F, 10, 13, 13, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -12F, -4F, 0F, -8F, 0F, 0F, -13F, -4F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, -4F, 0F); // Box 26
		attachmentModel[25].setRotationPoint(-65F, -36F, 24F);
		attachmentModel[25].rotateAngleX = 3.14159265F;

		attachmentModel[26].addBox(0F, 0F, 0F, 70, 1, 22, 0F); // Box 27
		attachmentModel[26].setRotationPoint(15F, -44F, -11F);

		attachmentModel[27].addBox(0F, 0F, 0F, 70, 22, 1, 0F); // Box 28
		attachmentModel[27].setRotationPoint(15F, -36F, -19F);

		attachmentModel[28].addFlexTrapezoid(0F, 0F, 0F, 1, 30, 5, 0F, -4.00F, -4.00F, 0.00F, 0.00F, 0.00F, 0.00F, ModelRendererTurbo.MR_BACK); // Box 29
		attachmentModel[28].setRotationPoint(14F, -40F, -23F);

		attachmentModel[29].addFlexTrapezoid(0F, 0F, 0F, 1, 30, 5, 0F, -4.00F, -4.00F, 0F, 0F, 0F, 0F, ModelRendererTurbo.MR_FRONT); // Box 30
		attachmentModel[29].setRotationPoint(14F, -40F, 18F);

		attachmentModel[30].addFlexTrapezoid(0F, 0F, 0F, 1, 5, 30, 0F, 0.00F, 0.00F, -4.00F, -4.00F, -4.00F, -4.00F, ModelRendererTurbo.MR_BOTTOM); // Box 31
		attachmentModel[30].setRotationPoint(14F, -48F, -15F);

		attachmentModel[31].addFlexTrapezoid(0F, 0F, 0F, 1, 5, 30, 0F, 0.00F, 0.00F, -4.00F, -4.00F, -4.00F, -4.00F, ModelRendererTurbo.MR_TOP); // Box 32
		attachmentModel[31].setRotationPoint(14F, -7F, -15F);

		attachmentModel[32].addBox(0F, 0F, 0F, 70, 1, 22, 0F); // Box 33
		attachmentModel[32].setRotationPoint(15F, -7F, -11F);

		attachmentModel[33].addShapeBox(0F, 0F, 0F, 10, 13, 13, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -12F, -4F, 0F, -8F, 0F, 0F, -13F, -4F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, -4F, 0F); // Box 34
		attachmentModel[33].setRotationPoint(-65F, -1F, 11F);
		attachmentModel[33].rotateAngleX = 1.57079633F;

		attachmentModel[34].addShapeBox(0F, 0F, 0F, 10, 13, 13, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -12F, -4F, 0F, -8F, 0F, 0F, -13F, -4F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, -4F, 0F); // Box 35
		attachmentModel[34].setRotationPoint(-65F, -14F, -24F);

		attachmentModel[35].addShapeBox(0F, 0F, 0F, 10, 13, 13, 0F, 0F, 0F, -5F, 0F, -4F, -1F, 0F, -12F, -4F, 0F, -8F, 0F, 0F, -13F, -4F, 0F, -9F, 0F, 0F, 0F, -4F, 0F, -4F, 0F); // Box 36
		attachmentModel[35].setRotationPoint(-65F, -49F, -11F);
		attachmentModel[35].rotateAngleX = -1.57079633F;

		attachmentModel[36].addShapeBox(0F, 0F, 0F, 15, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 37
		attachmentModel[36].setRotationPoint(-80F, -5F, 11F);
		attachmentModel[36].rotateAngleX = 1.57079633F;

		attachmentModel[37].addShapeBox(0F, 0F, 0F, 15, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 38
		attachmentModel[37].setRotationPoint(-80F, -14F, -20F);

		attachmentModel[38].addShapeBox(0F, 0F, 0F, 15, 9, 9, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 39
		attachmentModel[38].setRotationPoint(-80F, -45F, -11F);
		attachmentModel[38].rotateAngleX = -1.57079633F;

		attachmentModel[39].addShapeBox(0F, 0F, 0F, 70, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 40
		attachmentModel[39].setRotationPoint(15F, -44F, -11F);
		attachmentModel[39].rotateAngleX = -1.57079633F;

		attachmentModel[40].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 41
		attachmentModel[40].setRotationPoint(14F, -48F, -23F);

		attachmentModel[41].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 42
		attachmentModel[41].setRotationPoint(14F, -2F, -23F);
		attachmentModel[41].rotateAngleX = 1.57079633F;

		attachmentModel[42].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 43
		attachmentModel[42].setRotationPoint(14F, -2F, 23F);
		attachmentModel[42].rotateAngleX = 3.14159265F;

		attachmentModel[43].addShapeBox(0F, 0F, 0F, 1, 12, 12, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -7F, 0F, 0F, -7F); // Box 44
		attachmentModel[43].setRotationPoint(14F, -48F, 23F);
		attachmentModel[43].rotateAngleX = -1.57079633F;

		attachmentModel[44].addBox(0F, 0F, 0F, 70, 22, 1, 0F); // Box 45
		attachmentModel[44].setRotationPoint(15F, -36F, 18F);

		attachmentModel[45].addShapeBox(0F, 0F, 0F, 70, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 46
		attachmentModel[45].setRotationPoint(15F, -14F, -19F);

		attachmentModel[46].addShapeBox(0F, 0F, 0F, 70, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 47
		attachmentModel[46].setRotationPoint(15F, -6F, 11F);
		attachmentModel[46].rotateAngleX = 1.57079633F;

		attachmentModel[47].addShapeBox(0F, 0F, 0F, 70, 8, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 48
		attachmentModel[47].setRotationPoint(15F, -36F, 19F);
		attachmentModel[47].rotateAngleX = 3.14159265F;



		flipAll();
	}
}