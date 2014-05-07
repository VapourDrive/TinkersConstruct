package tconstruct.client.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BeltModel extends ModelBiped
{
    ModelRenderer Buckle;
    ModelRenderer FrontRight;
    ModelRenderer FrontLeft;
    ModelRenderer SideRight;
    ModelRenderer SideLeft;
    ModelRenderer Back;

    public BeltModel()
    {
        textureWidth = 64;
        textureHeight = 32;

        Buckle = new ModelRenderer(this, 8, 9);
        Buckle.addBox(-2F, -2F, 0F, 4, 4, 1);
        Buckle.setRotationPoint(0F, 10F, -3F);
        setRotation(Buckle, 0F, 0F, 0F);
        
        FrontRight = new ModelRenderer(this, 0, 9);
        FrontRight.addBox(-3F, -1F, 0F, 3, 2, 1);
        FrontRight.setRotationPoint(-2F, 10F, -3F);
        setRotation(FrontRight, 0F, 0F, 0F);
        
        FrontLeft = new ModelRenderer(this, 18, 9);
        FrontLeft.addBox(0F, -1F, 0F, 3, 2, 1);
        FrontLeft.setRotationPoint(2F, 10F, -3F);
        setRotation(FrontLeft, 0F, 0F, 0F);
        
        SideRight = new ModelRenderer(this, 0, 3);
        SideRight.addBox(-1F, -1F, 0F, 1, 2, 4);
        SideRight.setRotationPoint(-4F, 10F, -2F);
        setRotation(SideRight, 0F, 0F, 0F);
        
        SideLeft = new ModelRenderer(this, 16, 3);
        SideLeft.addBox(0F, -1F, 0F, 1, 2, 4);
        SideLeft.setRotationPoint(4F, 10F, -2F);
        setRotation(SideLeft, 0F, 0F, 0F);
        
        Back = new ModelRenderer(this, 2, 0);
        Back.addBox(-5F, -1F, 0F, 10, 2, 1);
        Back.setRotationPoint(0F, 10F, 2F);
        setRotation(Back, 0F, 0F, 0F);
    }

    public void render (Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        //super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Buckle.render(f5);
        FrontRight.render(f5);
        FrontLeft.render(f5);
        SideRight.render(f5);
        SideLeft.render(f5);
        Back.render(f5);
    }

    private void setRotation (ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles (float f, float f1, float partialTick, float f3, float f4, float f5, Entity player)
    {
        super.setRotationAngles(f, f1, partialTick, f3, f4, f5, player);
    }

}
