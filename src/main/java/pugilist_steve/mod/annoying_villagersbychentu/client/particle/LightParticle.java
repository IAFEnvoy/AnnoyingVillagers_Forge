package pugilist_steve.mod.annoying_villagersbychentu.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)

public class LightParticle extends TextureSheetParticle {
    private final SpriteSet spriteSet;

    protected LightParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        this.setSize(0.2f, 0.2f);
        this.quadSize *= 1100.0f;
        this.lifetime = 30;
        this.gravity = 0.0f;
        this.hasPhysics = false;
        this.xd = vx * 0.0d;
        this.yd = vy * 0.0d;
        this.zd = vz * 0.0d;
        this.setSpriteFromAge(spriteSet);
    }

    public static LightParticleProvider provider(SpriteSet spriteSet) {
        return new LightParticleProvider(spriteSet);
    }

    @Override
    public int getLightColor(float partialTick) {
        return 15728880;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_LIT;
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.removed) {
            this.setSprite(this.spriteSet.get(((this.age / 3) % 9) + 1, 9));
        }
    }

    public static class LightParticleProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public LightParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }


        @Override
        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new LightParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }
}
