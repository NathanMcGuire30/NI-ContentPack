//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Rail Rifle 1
// Model Creator: 
// Created on: 14.12.2018 - 15:21:52
// Last changed on: 14.12.2018 - 15:21:52

package com.flansmod.client.model.NathanPack; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRailRifle extends ModelGun //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelRailRifle() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[40];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Import Box1
		gunModel[2] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Import Box3
		gunModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Import Box5
		gunModel[5] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box7
		gunModel[6] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Import Shape10
		gunModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Import Shape15
		gunModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Shape17
		gunModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Import Shape18
		gunModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Import Shape19
		gunModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Import Shape20
		gunModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Trigger
		gunModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Import Box23
		gunModel[14] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Import Shape24
		gunModel[15] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Shape25
		gunModel[16] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 1
		gunModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 2
		gunModel[18] = new ModelRendererTurbo(this, 545, 1, textureX, textureY); // Box 3
		gunModel[19] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 4
		gunModel[20] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 6
		gunModel[21] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 7
		gunModel[22] = new ModelRendererTurbo(this, 689, 1, textureX, textureY); // Box 9
		gunModel[23] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Shape 12
		gunModel[24] = new ModelRendererTurbo(this, 833, 1, textureX, textureY); // Shape 13
		gunModel[25] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 14
		gunModel[26] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 15
		gunModel[27] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Shape 69
		gunModel[28] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Shape 77
		gunModel[29] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Shape 112
		gunModel[30] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Shape 113
		gunModel[31] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Shape 114
		gunModel[32] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Shape 34
		gunModel[33] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 35
		gunModel[34] = new ModelRendererTurbo(this, 993, 1, textureX, textureY); // Box 36
		gunModel[35] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 37
		gunModel[36] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 38
		gunModel[37] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 40
		gunModel[38] = new ModelRendererTurbo(this, 937, 1, textureX, textureY); // Shape 41
		gunModel[39] = new ModelRendererTurbo(this, 961, 1, textureX, textureY); // Shape 42

		gunModel[0].addBox(0F, 0F, 0F, 42, 2, 10, 0F); // Import Box0
		gunModel[0].setRotationPoint(-27F, -11F, -5F);

		gunModel[1].addBox(0F, 0F, 0F, 13, 4, 6, 0F); // Import Box1
		gunModel[1].setRotationPoint(-2F, -9F, -3F);

		gunModel[2].addBox(0F, 0F, 0F, 3, 10, 6, 0F); // Import Box2
		gunModel[2].setRotationPoint(3F, -6F, -3F);
		gunModel[2].rotateAngleZ = -0.27925268F;

		gunModel[3].addBox(0F, 0F, 0F, 14, 4, 4, 0F); // Import Box3
		gunModel[3].setRotationPoint(-28F, -15F, -2F);

		gunModel[4].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Import Box5
		gunModel[4].setRotationPoint(-27F, -9F, -5F);

		gunModel[5].addBox(0F, 0F, 0F, 13, 8, 6, 0F); // Import Box7
		gunModel[5].setRotationPoint(-27F, -9F, -3F);

		gunModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 6, 4, 1, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape10
		gunModel[6].setRotationPoint(-27F, -7F, -3F);
		gunModel[6].rotateAngleX = 3.14159265F;
		gunModel[6].rotateAngleZ = -1.57079633F;

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape15
		gunModel[7].setRotationPoint(-27F, -15F, 2F);
		gunModel[7].rotateAngleY = -1.57079633F;
		gunModel[7].rotateAngleZ = 1.57079633F;

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 7, 4, 3, 12, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Import Shape17
		gunModel[8].setRotationPoint(-27F, -15F, -2F);
		gunModel[8].rotateAngleY = 1.57079633F;
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 25, 2, 1, 6, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape18
		gunModel[9].setRotationPoint(11F, -9F, 5F);
		gunModel[9].rotateAngleY = -1.57079633F;
		gunModel[9].rotateAngleZ = 3.14159265F;

		gunModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 25, 2, 1, 6, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape19
		gunModel[10].setRotationPoint(-14F, -9F, -5F);
		gunModel[10].rotateAngleY = 1.57079633F;
		gunModel[10].rotateAngleZ = 3.14159265F;

		gunModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 1, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Import Shape20
		gunModel[11].setRotationPoint(-14F, -8F, 5F);
		gunModel[11].rotateAngleY = -1.57079633F;
		gunModel[11].rotateAngleZ = 3.14159265F;

		gunModel[12].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Import Trigger
		gunModel[12].setRotationPoint(6F, -5F, -1F);

		gunModel[13].addBox(0F, 0F, 0F, 19, 1, 4, 0F); // Import Box23
		gunModel[13].setRotationPoint(-2F, -16F, -2F);

		gunModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape24
		gunModel[14].setRotationPoint(19F, -15F, 2F);

		gunModel[15].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape25
		gunModel[15].setRotationPoint(-4F, -15F, -2F);
		gunModel[15].rotateAngleY = 3.14159265F;

		gunModel[16].addBox(0F, 0F, 0F, 29, 3, 10, 0F); // Box 1
		gunModel[16].setRotationPoint(-14F, -14F, -5F);

		gunModel[17].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 2
		gunModel[17].setRotationPoint(-14F, -9F, -3F);

		gunModel[18].addBox(0F, 0F, 0F, 28, 4, 8, 0F); // Box 3
		gunModel[18].setRotationPoint(11F, -9F, -4F);

		gunModel[19].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 4
		gunModel[19].setRotationPoint(39F, -13F, -1.5F);

		gunModel[20].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 6
		gunModel[20].setRotationPoint(-20F, -15F, -5F);

		gunModel[21].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[21].setRotationPoint(-20F, -15F, 2F);

		gunModel[22].addBox(0F, 0F, 0F, 53, 1, 8, 0F); // Box 9
		gunModel[22].setRotationPoint(-14F, -15F, -4F);

		gunModel[23].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 4, 1, 4) }), 28, 1, 4, 10, 28, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,1}); // Shape 12
		gunModel[23].setRotationPoint(39F, -9F, 5F);
		gunModel[23].rotateAngleY = -1.57079633F;
		gunModel[23].rotateAngleZ = 3.14159265F;

		gunModel[24].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(0, 4, 0, 4) }), 28, 1, 4, 10, 28, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,1}); // Shape 13
		gunModel[24].setRotationPoint(39F, -9F, -4F);
		gunModel[24].rotateAngleY = -1.57079633F;
		gunModel[24].rotateAngleZ = 3.14159265F;

		gunModel[25].addBox(0F, 0F, 0F, 20, 5, 8, 0F); // Box 14
		gunModel[25].setRotationPoint(15F, -14F, -4F);

		gunModel[26].addBox(0F, 0F, 0F, 6, 5, 10, 0F); // Box 15
		gunModel[26].setRotationPoint(39F, -14F, 5F);
		gunModel[26].rotateAngleY = 3.14159265F;

		gunModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 53, 2, 21, 4, 53, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 69
		gunModel[27].setRotationPoint(-14F, -14F, 5F);
		gunModel[27].rotateAngleY = 1.57079633F;

		gunModel[28].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 53, 1, 9, 4, 53, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 77
		gunModel[28].setRotationPoint(-14F, -15F, -4F);
		gunModel[28].rotateAngleY = 1.57079633F;
		gunModel[28].rotateAngleZ = 1.57079633F;

		gunModel[29].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 112
		gunModel[29].setRotationPoint(-28F, -15F, -2F);
		gunModel[29].rotateAngleY = 1.57079633F;
		gunModel[29].rotateAngleZ = 1.57079633F;

		gunModel[30].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 1, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Shape 113
		gunModel[30].setRotationPoint(-27F, -8F, -5F);
		gunModel[30].rotateAngleY = 1.57079633F;
		gunModel[30].rotateAngleZ = 3.14159265F;

		gunModel[31].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 7, 4, 3, 12, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Shape 114
		gunModel[31].setRotationPoint(-20F, -15F, 2F);
		gunModel[31].rotateAngleY = -1.57079633F;
		gunModel[31].rotateAngleZ = 1.57079633F;

		gunModel[32].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 1, 6, 1) }), 6, 6, 1, 14, 6, ModelRendererTurbo.MR_FRONT, new float[] {7 ,1 ,6}); // Shape 34
		gunModel[32].setRotationPoint(-27F, -7F, 3F);
		gunModel[32].rotateAngleZ = 1.57079633F;

		gunModel[33].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 35
		gunModel[33].setRotationPoint(19F, -14F, 5F);
		gunModel[33].rotateAngleY = 3.14159265F;

		gunModel[34].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 36
		gunModel[34].setRotationPoint(23F, -14F, 5F);
		gunModel[34].rotateAngleY = 3.14159265F;

		gunModel[35].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 37
		gunModel[35].setRotationPoint(27F, -14F, 5F);
		gunModel[35].rotateAngleY = 3.14159265F;

		gunModel[36].addBox(0F, 0F, 0F, 2, 5, 10, 0F); // Box 38
		gunModel[36].setRotationPoint(31F, -14F, 5F);
		gunModel[36].rotateAngleY = 3.14159265F;

		gunModel[37].addBox(0F, 0F, 0F, 20, 1, 4, 0F); // Box 40
		gunModel[37].setRotationPoint(15F, -5F, -2F);

		gunModel[38].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 4, 4, 1, 10, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 41
		gunModel[38].setRotationPoint(39F, -5F, -2F);
		gunModel[38].rotateAngleX = 3.14159265F;

		gunModel[39].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 4, 4, 1, 10, 4, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Shape 42
		gunModel[39].setRotationPoint(11F, -5F, 2F);
		gunModel[39].rotateAngleX = 3.14159265F;
		gunModel[39].rotateAngleY = -3.14159265F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Box6

		ammoModel[0].addBox(0F, 0F, 0F, 12, 13, 4, 0F); // Import Box6
		ammoModel[0].setRotationPoint(-14F, -8F, -2F);



		barrelAttachPoint = new Vector3f(44F /16F, 12F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(7F /16F, 16F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(21 /16F, 4F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(0 /16F, -1F /16F, 0F /16F);


		animationType = EnumAnimationType.BULLPUP;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}