package com.fiskmods.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelPommelKnighted extends ModelBase {

    public ModelRenderer body1;
    public ModelRenderer connector;
    public ModelRenderer cap1;
    public ModelRenderer top1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer body9;
    public ModelRenderer body10;
    public ModelRenderer body11;
    public ModelRenderer body12;
    public ModelRenderer body13;
    public ModelRenderer body14;
    public ModelRenderer body15;
    public ModelRenderer body19;
    public ModelRenderer body23;
    public ModelRenderer body27;
    public ModelRenderer body31;
    public ModelRenderer body35;
    public ModelRenderer body16;
    public ModelRenderer body17;
    public ModelRenderer body18;
    public ModelRenderer body20;
    public ModelRenderer body21;
    public ModelRenderer body22;
    public ModelRenderer body24;
    public ModelRenderer body25;
    public ModelRenderer body26;
    public ModelRenderer body28;
    public ModelRenderer body29;
    public ModelRenderer body30;
    public ModelRenderer body32;
    public ModelRenderer body33;
    public ModelRenderer body34;
    public ModelRenderer body36;
    public ModelRenderer body37;
    public ModelRenderer body38;
    public ModelRenderer cap2;
    public ModelRenderer cap3;
    public ModelRenderer cap4;
    public ModelRenderer cap5;
    public ModelRenderer cap6;
    public ModelRenderer cap7;
    public ModelRenderer cap8;
    public ModelRenderer top2;
    public ModelRenderer top3;
    public ModelRenderer top4;
    public ModelRenderer top5;
    public ModelRenderer top6;
    public ModelRenderer top7;
    public ModelRenderer top8;

    public ModelPommelKnighted() {
        textureWidth = 64;
        textureHeight = 32;
        body23 = new ModelRenderer(this, 0, 12);
        body23.setRotationPoint(0.0F, 4.5F, 0.0F);
        body23.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        setRotateAngle(body23, 0.0F, 2.0943951023931953F, 0.0F);
        body9 = new ModelRenderer(this, 0, 24);
        body9.setRotationPoint(0.0F, 4.5F, 0.0F);
        body9.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        top4 = new ModelRenderer(this, 8, 12);
        top4.setRotationPoint(0.0F, 0.0F, 0.0F);
        top4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top4, 0.0F, 2.356194490192345F, 0.0F);
        body32 = new ModelRenderer(this, 4, 26);
        body32.setRotationPoint(0.0F, -3.0F, 4.5F);
        body32.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body32, 0.5585053606381855F, 0.0F, 0.0F);
        body5 = new ModelRenderer(this, 0, 0);
        body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        body5.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        body26 = new ModelRenderer(this, 4, 21);
        body26.setRotationPoint(0.0F, 7.7F, 0.0F);
        body26.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body26, 0.13962634015954636F, 0.0F, 0.0F);
        cap5 = new ModelRenderer(this, 12, 0);
        cap5.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap5.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap5, 0.0F, 3.141592653589793F, 0.0F);
        body7 = new ModelRenderer(this, 0, 0);
        body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        body7.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        top6 = new ModelRenderer(this, 8, 12);
        top6.setRotationPoint(0.0F, 0.0F, 0.0F);
        top6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top6, 0.0F, -2.356194490192345F, 0.0F);
        body12 = new ModelRenderer(this, 0, 24);
        body12.setRotationPoint(0.0F, 4.5F, 0.0F);
        body12.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(body12, 0.0F, 3.141592653589793F, 0.0F);
        body19 = new ModelRenderer(this, 0, 12);
        body19.setRotationPoint(0.0F, 4.5F, 0.0F);
        body19.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        setRotateAngle(body19, 0.0F, 1.0471975511965976F, 0.0F);
        body11 = new ModelRenderer(this, 0, 24);
        body11.setRotationPoint(0.0F, 4.5F, 0.0F);
        body11.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(body11, 0.0F, 2.0943951023931953F, 0.0F);
        body14 = new ModelRenderer(this, 0, 24);
        body14.setRotationPoint(0.0F, 4.5F, 0.0F);
        body14.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(body14, 0.0F, -1.0471975511965976F, 0.0F);
        body34 = new ModelRenderer(this, 4, 21);
        body34.setRotationPoint(0.0F, 7.7F, 0.0F);
        body34.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body34, 0.13962634015954636F, 0.0F, 0.0F);
        top3 = new ModelRenderer(this, 8, 12);
        top3.setRotationPoint(0.0F, 0.0F, 0.0F);
        top3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top3, 0.0F, 1.5707963267948966F, 0.0F);
        top8 = new ModelRenderer(this, 8, 12);
        top8.setRotationPoint(0.0F, 0.0F, 0.0F);
        top8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top8, 0.0F, -0.7853981633974483F, 0.0F);
        body8 = new ModelRenderer(this, 0, 0);
        body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        body8.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        body20 = new ModelRenderer(this, 4, 26);
        body20.setRotationPoint(0.0F, -3.0F, 4.5F);
        body20.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body20, 0.5585053606381855F, 0.0F, 0.0F);
        body35 = new ModelRenderer(this, 0, 12);
        body35.setRotationPoint(0.0F, 4.5F, 0.0F);
        body35.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        setRotateAngle(body35, 0.0F, -1.0471975511965976F, 0.0F);
        body17 = new ModelRenderer(this, 4, 12);
        body17.setRotationPoint(0.0F, -3.0F, 4.5F);
        body17.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body17, 0.05235987755982988F, 0.0F, 0.0F);
        body36 = new ModelRenderer(this, 4, 26);
        body36.setRotationPoint(0.0F, -3.0F, 4.5F);
        body36.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body36, 0.5585053606381855F, 0.0F, 0.0F);
        body27 = new ModelRenderer(this, 0, 12);
        body27.setRotationPoint(0.0F, 4.5F, 0.0F);
        body27.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        setRotateAngle(body27, 0.0F, 3.141592653589793F, 0.0F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        body1.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        top1 = new ModelRenderer(this, 8, 12);
        top1.setRotationPoint(0.0F, 0.0F, 0.0F);
        top1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        cap1 = new ModelRenderer(this, 12, 0);
        cap1.setRotationPoint(0.0F, 12.0F, 0.0F);
        cap1.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        body16 = new ModelRenderer(this, 4, 26);
        body16.setRotationPoint(0.0F, -3.0F, 4.5F);
        body16.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body16, 0.5585053606381855F, 0.0F, 0.0F);
        body31 = new ModelRenderer(this, 0, 12);
        body31.setRotationPoint(0.0F, 4.5F, 0.0F);
        body31.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        setRotateAngle(body31, 0.0F, -2.0943951023931953F, 0.0F);
        body21 = new ModelRenderer(this, 4, 12);
        body21.setRotationPoint(0.0F, -3.0F, 4.5F);
        body21.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body21, 0.05235987755982988F, 0.0F, 0.0F);
        body37 = new ModelRenderer(this, 4, 12);
        body37.setRotationPoint(0.0F, -3.0F, 4.5F);
        body37.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body37, 0.05235987755982988F, 0.0F, 0.0F);
        body30 = new ModelRenderer(this, 4, 21);
        body30.setRotationPoint(0.0F, 7.7F, 0.0F);
        body30.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body30, 0.13962634015954636F, 0.0F, 0.0F);
        connector = new ModelRenderer(this, 12, 5);
        connector.setRotationPoint(0.0F, 9.0F, 0.0F);
        connector.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
        cap8 = new ModelRenderer(this, 12, 0);
        cap8.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap8.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap8, 0.0F, -0.7853981633974483F, 0.0F);
        cap4 = new ModelRenderer(this, 12, 0);
        cap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap4.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap4, 0.0F, 2.356194490192345F, 0.0F);
        top2 = new ModelRenderer(this, 8, 12);
        top2.setRotationPoint(0.0F, 0.0F, 0.0F);
        top2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top2, 0.0F, 0.7853981633974483F, 0.0F);
        top5 = new ModelRenderer(this, 8, 12);
        top5.setRotationPoint(0.0F, 0.0F, 0.0F);
        top5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top5, 0.0F, 3.141592653589793F, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        body38 = new ModelRenderer(this, 4, 21);
        body38.setRotationPoint(0.0F, 7.7F, 0.0F);
        body38.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body38, 0.13962634015954636F, 0.0F, 0.0F);
        cap3 = new ModelRenderer(this, 12, 0);
        cap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap3.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap3, 0.0F, 1.5707963267948966F, 0.0F);
        cap6 = new ModelRenderer(this, 12, 0);
        cap6.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap6.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap6, 0.0F, -2.356194490192345F, 0.0F);
        body24 = new ModelRenderer(this, 4, 26);
        body24.setRotationPoint(0.0F, -3.0F, 4.5F);
        body24.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body24, 0.5585053606381855F, 0.0F, 0.0F);
        body33 = new ModelRenderer(this, 4, 12);
        body33.setRotationPoint(0.0F, -3.0F, 4.5F);
        body33.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body33, 0.05235987755982988F, 0.0F, 0.0F);
        body13 = new ModelRenderer(this, 0, 24);
        body13.setRotationPoint(0.0F, 4.5F, 0.0F);
        body13.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(body13, 0.0F, -2.0943951023931953F, 0.0F);
        body10 = new ModelRenderer(this, 0, 24);
        body10.setRotationPoint(0.0F, 4.5F, 0.0F);
        body10.addBox(-4.3F, -3.0F, -0.5F, 1, 6, 1, 0.0F);
        setRotateAngle(body10, 0.0F, 1.0471975511965976F, 0.0F);
        body25 = new ModelRenderer(this, 4, 12);
        body25.setRotationPoint(0.0F, -3.0F, 4.5F);
        body25.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body25, 0.05235987755982988F, 0.0F, 0.0F);
        body15 = new ModelRenderer(this, 0, 12);
        body15.setRotationPoint(0.0F, 4.5F, 0.0F);
        body15.addBox(-0.5F, -3.0F, 3.5F, 1, 11, 1, 0.0F);
        body29 = new ModelRenderer(this, 4, 12);
        body29.setRotationPoint(0.0F, -3.0F, 4.5F);
        body29.addBox(-0.5F, 0.0F, -1.0F, 1, 8, 1, 0.0F);
        setRotateAngle(body29, 0.05235987755982988F, 0.0F, 0.0F);
        cap7 = new ModelRenderer(this, 12, 0);
        cap7.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap7.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap7, 0.0F, -1.5707963267948966F, 0.0F);
        cap2 = new ModelRenderer(this, 12, 0);
        cap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        cap2.addBox(-1.5F, 0.0F, -0.38F, 3, 1, 4, 0.0F);
        setRotateAngle(cap2, 0.0F, 0.7853981633974483F, 0.0F);
        body28 = new ModelRenderer(this, 4, 26);
        body28.setRotationPoint(0.0F, -3.0F, 4.5F);
        body28.addBox(-0.5F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
        setRotateAngle(body28, 0.5585053606381855F, 0.0F, 0.0F);
        body4 = new ModelRenderer(this, 0, 0);
        body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        body4.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        body6 = new ModelRenderer(this, 0, 0);
        body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        body6.addBox(-1.5F, 0.0F, 0.62F, 3, 9, 3, 0.0F);
        setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        body22 = new ModelRenderer(this, 4, 21);
        body22.setRotationPoint(0.0F, 7.7F, 0.0F);
        body22.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body22, 0.13962634015954636F, 0.0F, 0.0F);
        body18 = new ModelRenderer(this, 4, 21);
        body18.setRotationPoint(0.0F, 7.7F, 0.0F);
        body18.addBox(-0.5F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
        setRotateAngle(body18, 0.13962634015954636F, 0.0F, 0.0F);
        top7 = new ModelRenderer(this, 8, 12);
        top7.setRotationPoint(0.0F, 0.0F, 0.0F);
        top7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(top7, 0.0F, -1.5707963267948966F, 0.0F);
        body1.addChild(body23);
        body1.addChild(body9);
        top1.addChild(top4);
        body31.addChild(body32);
        body1.addChild(body5);
        body25.addChild(body26);
        cap1.addChild(cap5);
        body1.addChild(body7);
        top1.addChild(top6);
        body1.addChild(body12);
        body1.addChild(body19);
        body1.addChild(body11);
        body1.addChild(body14);
        body33.addChild(body34);
        top1.addChild(top3);
        top1.addChild(top8);
        body1.addChild(body8);
        body19.addChild(body20);
        body1.addChild(body35);
        body15.addChild(body17);
        body35.addChild(body36);
        body1.addChild(body27);
        body1.addChild(body3);
        body15.addChild(body16);
        body1.addChild(body31);
        body19.addChild(body21);
        body35.addChild(body37);
        body29.addChild(body30);
        cap1.addChild(cap8);
        cap1.addChild(cap4);
        top1.addChild(top2);
        top1.addChild(top5);
        body1.addChild(body2);
        body37.addChild(body38);
        cap1.addChild(cap3);
        cap1.addChild(cap6);
        body23.addChild(body24);
        body31.addChild(body33);
        body1.addChild(body13);
        body1.addChild(body10);
        body23.addChild(body25);
        body1.addChild(body15);
        body27.addChild(body29);
        cap1.addChild(cap7);
        cap1.addChild(cap2);
        body27.addChild(body28);
        body1.addChild(body4);
        body1.addChild(body6);
        body21.addChild(body22);
        body17.addChild(body18);
        top1.addChild(top7);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(top1.offsetX, top1.offsetY, top1.offsetZ);
        GL11.glTranslatef(top1.rotationPointX * f5, top1.rotationPointY * f5, top1.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 0.8D);
        GL11.glTranslatef(-top1.offsetX, -top1.offsetY, -top1.offsetZ);
        GL11.glTranslatef(-top1.rotationPointX * f5, -top1.rotationPointY * f5, -top1.rotationPointZ * f5);
        top1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(cap1.offsetX, cap1.offsetY, cap1.offsetZ);
        GL11.glTranslatef(cap1.rotationPointX * f5, cap1.rotationPointY * f5, cap1.rotationPointZ * f5);
        GL11.glScaled(1.3D, 1.3D, 1.3D);
        GL11.glTranslatef(-cap1.offsetX, -cap1.offsetY, -cap1.offsetZ);
        GL11.glTranslatef(-cap1.rotationPointX * f5, -cap1.rotationPointY * f5, -cap1.rotationPointZ * f5);
        cap1.render(f5);
        GL11.glPopMatrix();
        connector.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
