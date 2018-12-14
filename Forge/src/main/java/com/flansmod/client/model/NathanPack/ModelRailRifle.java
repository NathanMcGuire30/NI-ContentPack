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
		gunModel = new ModelRendererTurbo[31];
		gunModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Box0
		gunModel[1] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Import Box1
		gunModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Import Box2
		gunModel[3] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Import Box3
		gunModel[4] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Import Box5
		gunModel[5] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Import Box7
		gunModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Import Shape9
		gunModel[7] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Import Shape10
		gunModel[8] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Import Shape15
		gunModel[9] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Import Shape16
		gunModel[10] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Import Shape17
		gunModel[11] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Import Shape18
		gunModel[12] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Import Shape19
		gunModel[13] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Import Shape20
		gunModel[14] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Import Shape21
		gunModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Import Trigger
		gunModel[16] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Import Box23
		gunModel[17] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Import Shape24
		gunModel[18] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Import Shape25
		gunModel[19] = new ModelRendererTurbo(this, 553, 1, textureX, textureY); // Box 1
		gunModel[20] = new ModelRendererTurbo(this, 673, 1, textureX, textureY); // Box 2
		gunModel[21] = new ModelRendererTurbo(this, 713, 1, textureX, textureY); // Box 3
		gunModel[22] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 4
		gunModel[23] = new ModelRendererTurbo(this, 817, 1, textureX, textureY); // Box 6
		gunModel[24] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 7
		gunModel[25] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Shape 8
		gunModel[26] = new ModelRendererTurbo(this, 881, 1, textureX, textureY); // Box 9
		gunModel[27] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Shape 10
		gunModel[28] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Shape 11
		gunModel[29] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Shape 12
		gunModel[30] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Shape 13

		gunModel[0].addBox(0F, 0F, 0F, 66, 2, 10, 0F); // Import Box0
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

		gunModel[6].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(6, 0, 6, 0), new Coord2D(6, 1, 6, 1) }), 6, 6, 1, 14, 6, ModelRendererTurbo.MR_FRONT, new float[] {7 ,1 ,6}); // Import Shape9
		gunModel[6].setRotationPoint(-27F, -7F, 3F);
		gunModel[6].rotateAngleZ = 1.57079633F;

		gunModel[7].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 6, 4, 1, 10, 6, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape10
		gunModel[7].setRotationPoint(-27F, -7F, -3F);
		gunModel[7].rotateAngleX = 3.14159265F;
		gunModel[7].rotateAngleZ = -1.57079633F;

		gunModel[8].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape15
		gunModel[8].setRotationPoint(-27F, -15F, 2F);
		gunModel[8].rotateAngleY = -1.57079633F;
		gunModel[8].rotateAngleZ = 1.57079633F;

		gunModel[9].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 1, 4, 1) }), 1, 4, 1, 10, 1, ModelRendererTurbo.MR_FRONT, new float[] {5 ,1 ,4}); // Import Shape16
		gunModel[9].setRotationPoint(-28F, -15F, -2F);
		gunModel[9].rotateAngleY = 1.57079633F;
		gunModel[9].rotateAngleZ = 1.57079633F;

		gunModel[10].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(4, 0, 4, 0), new Coord2D(4, 3, 4, 3) }), 7, 4, 3, 12, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,3 ,4}); // Import Shape17
		gunModel[10].setRotationPoint(-27F, -15F, -2F);
		gunModel[10].rotateAngleY = 1.57079633F;
		gunModel[10].rotateAngleZ = 1.57079633F;

		gunModel[11].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 25, 2, 1, 6, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape18
		gunModel[11].setRotationPoint(11F, -9F, 5F);
		gunModel[11].rotateAngleY = -1.57079633F;
		gunModel[11].rotateAngleZ = 3.14159265F;

		gunModel[12].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 25, 2, 1, 6, 25, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape19
		gunModel[12].setRotationPoint(-14F, -9F, -5F);
		gunModel[12].rotateAngleY = 1.57079633F;
		gunModel[12].rotateAngleZ = 3.14159265F;

		gunModel[13].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 1, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Import Shape20
		gunModel[13].setRotationPoint(-14F, -8F, 5F);
		gunModel[13].rotateAngleY = -1.57079633F;
		gunModel[13].rotateAngleZ = 3.14159265F;

		gunModel[14].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 7, 2, 7) }), 13, 2, 7, 17, 13, ModelRendererTurbo.MR_FRONT, new float[] {8 ,7 ,2}); // Import Shape21
		gunModel[14].setRotationPoint(-27F, -8F, -5F);
		gunModel[14].rotateAngleY = 1.57079633F;
		gunModel[14].rotateAngleZ = 3.14159265F;

		gunModel[15].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Import Trigger
		gunModel[15].setRotationPoint(6F, -5F, -1F);

		gunModel[16].addBox(0F, 0F, 0F, 37, 1, 4, 0F); // Import Box23
		gunModel[16].setRotationPoint(-2F, -16F, -2F);

		gunModel[17].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape24
		gunModel[17].setRotationPoint(37F, -15F, 2F);

		gunModel[18].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(2, 0, 2, 0), new Coord2D(2, 1, 2, 1) }), 4, 2, 1, 6, 4, ModelRendererTurbo.MR_FRONT, new float[] {3 ,1 ,2}); // Import Shape25
		gunModel[18].setRotationPoint(-4F, -15F, -2F);
		gunModel[18].rotateAngleY = 3.14159265F;

		gunModel[19].addBox(0F, 0F, 0F, 53, 3, 10, 0F); // Box 1
		gunModel[19].setRotationPoint(-14F, -14F, -5F);

		gunModel[20].addBox(0F, 0F, 0F, 15, 1, 6, 0F); // Box 2
		gunModel[20].setRotationPoint(-14F, -9F, -3F);

		gunModel[21].addBox(0F, 0F, 0F, 28, 4, 8, 0F); // Box 3
		gunModel[21].setRotationPoint(11F, -9F, -4F);

		gunModel[22].addBox(0F, 0F, 0F, 9, 3, 3, 0F); // Box 4
		gunModel[22].setRotationPoint(39F, -13F, -1.5F);

		gunModel[23].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F); // Box 6
		gunModel[23].setRotationPoint(-20F, -15F, -5F);

		gunModel[24].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		gunModel[24].setRotationPoint(-20F, -15F, 2F);

		gunModel[25].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(3, 0, 3, 0), new Coord2D(3, 4, 3, 4) }), 7, 3, 4, 12, 7, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,3}); // Shape 8
		gunModel[25].setRotationPoint(-27F, -11F, 5F);
		gunModel[25].rotateAngleY = 1.57079633F;

		gunModel[26].addBox(0F, 0F, 0F, 53, 1, 8, 0F); // Box 9
		gunModel[26].setRotationPoint(-14F, -15F, -4F);

		gunModel[27].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 53, 2, 1, 4, 53, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 10
		gunModel[27].setRotationPoint(-14F, -14F, 5F);
		gunModel[27].rotateAngleY = 1.57079633F;

		gunModel[28].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 1, 1, 1) }), 53, 1, 1, 4, 53, ModelRendererTurbo.MR_FRONT, new float[] {2 ,1 ,1}); // Shape 11
		gunModel[28].setRotationPoint(-14F, -15F, -4F);
		gunModel[28].rotateAngleY = 1.57079633F;
		gunModel[28].rotateAngleZ = 1.57079633F;

		gunModel[29].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(1, 4, 1, 4) }), 28, 1, 4, 10, 28, ModelRendererTurbo.MR_FRONT, new float[] {5 ,4 ,1}); // Shape 12
		gunModel[29].setRotationPoint(39F, -9F, 5F);
		gunModel[29].rotateAngleY = -1.57079633F;
		gunModel[29].rotateAngleZ = 3.14159265F;

		gunModel[30].addShape3D(0F, 0F, 0F, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(1, 0, 1, 0), new Coord2D(0, 4, 0, 4) }), 28, 1, 4, 10, 28, ModelRendererTurbo.MR_FRONT, new float[] {4 ,5 ,1}); // Shape 13
		gunModel[30].setRotationPoint(39F, -9F, -4F);
		gunModel[30].rotateAngleY = -1.57079633F;
		gunModel[30].rotateAngleZ = 3.14159265F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 513, 1, textureX, textureY); // Import Box6

		ammoModel[0].addBox(0F, 0F, 0F, 12, 13, 4, 0F); // Import Box6
		ammoModel[0].setRotationPoint(-14F, -8F, -2F);



		barrelAttachPoint = new Vector3f(43F /16F, 12F /16F, 0F /16F);

		scopeAttachPoint = new Vector3f(7F /16F, 16F /16F, 0F /16F);

		gripAttachPoint = new Vector3f(21 /16F, 7F /16F, 0F /16F);


		thirdPersonOffset = new Vector3f(0 /16F, -1F /16F, 0F /16F);


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}